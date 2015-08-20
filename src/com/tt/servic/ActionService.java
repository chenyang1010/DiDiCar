package com.tt.servic;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class ActionService extends Service {

	private static final String TAG = "ActionLisener";
	private boolean runFlag = true;
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					while(runFlag) {
						Log.i(TAG, "ActionService-----------------Tap");
						doXue(OrderList.tap);
						Thread.sleep(1000 * 4);
					}
				}catch (InterruptedException e) {
						e.printStackTrace();
				}
					}
			}).start();
	}

	@Override
	public void onDestroy() {
		runFlag = false;
		Log.i(TAG, "ActionService-----------------Destroyed");
		super.onDestroy();
	}

	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
	}
	
	//点击发送按钮
	void doXue(String[] orders){
		Log.i(TAG, "doXue-----------------");
	    Runtime runtime = Runtime.getRuntime();
	    DataOutputStream dataOut;
	    try {
	  	      Process process = runtime.exec("su ");
	            InputStream in = process.getInputStream();
	            BufferedReader bufferReader = new BufferedReader(
	                            new InputStreamReader(in));
	            BufferedReader err=new BufferedReader(new InputStreamReader(process.getErrorStream()));
	            String line = null;
	            dataOut = new DataOutputStream(process.getOutputStream());
	          //点击发送按钮
	            for(String order : orders){
	            	dataOut.writeBytes(order + ";");
	            }
	            dataOut.flush();
	            
	            dataOut.close();
	            process.waitFor();
	            while ((line = err.readLine()) != null) {
	               Log.i(TAG,line);
	        }
	            while ((line = bufferReader.readLine()) != null) {
	            	Log.i(TAG,line);
	            }
	    } catch (Exception e) {
	            e.printStackTrace();
	            Log.i(TAG,e.getMessage());
	    }finally{

	    }
	}
}


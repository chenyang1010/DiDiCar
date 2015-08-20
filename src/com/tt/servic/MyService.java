package com.tt.servic;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
	static String TAG = "diaoliang";
	boolean flag = true;
	private AudioManager am = null;
	private boolean audioLis = true;
	private int preVolum = -1;
	private boolean toggle = false;
@Override
public IBinder onBind(Intent intent) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void onCreate() {
	// TODO Auto-generated method stub
	Log.i(TAG, "Service-----------------created");
	super.onCreate();
	am =  (AudioManager)this.getSystemService(Context.AUDIO_SERVICE);
	preVolum = am.getStreamVolume(AudioManager.STREAM_RING );
	Thread thread = new Thread() {
	@Override
	public void run() {
			Log.i(TAG, "Service-----------------");
			
			while(audioLis) {
				int  curVolum = am.getStreamVolume(AudioManager.STREAM_RING );
				Log.i(TAG, "curVolum:"+curVolum+";preVolum:"+preVolum+"-----------------");
				if (curVolum != preVolum) {
					Log.i(TAG, "curVolum"+curVolum+"preVolum"+preVolum+"-----------------");
					if(!toggle) {
						Intent intent = new Intent();
						intent.setAction("com.tt.servic.ActionService");
						startService(intent);
					} else {
						Intent intent = new Intent();
						intent.setAction("com.tt.servic.ActionService");
						stopService(intent);
					}
					toggle = !toggle;
					preVolum = curVolum;
				}
			}
	}
    };

	thread.start();
}

@Override
public void onDestroy() {
	// TODO Auto-generated method stub
	Log.i(TAG, "MyService-----------------Destroyed");
	audioLis = false;//让线程定制
	Intent intent = new Intent();
	intent.setAction("com.tt.servic.ActionService");
	stopService(intent);
	super.onDestroy();
	

}



@Override
public int onStartCommand(Intent intent, int flags, int startId) {
	// TODO Auto-generated method stub
	return super.onStartCommand(intent, flags, startId);
}


void doXue1(){
	Log.i(TAG, "doXue1-----------------");
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
              //Home键对应输入的驱动代码：
              dataOut.writeBytes("sendevent /dev/input/event1 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event1 1 102 1;");
              dataOut.writeBytes("sendevent /dev/input/event1 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event1 1 102 0;");
              dataOut.writeBytes("sendevent /dev/input/event1 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event1 0 0 0;");

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


void doXue2(){
	Log.i(TAG, "doXue2-----------------");
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
              //从主页点击QQ图标启动QQ的驱动代码
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 1 330 1;");
              dataOut.writeBytes("sendevent /dev/input/event4 3 53 83;");
              dataOut.writeBytes("sendevent /dev/input/event4 3 54 916;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 1 330 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");

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


//在弹出的输入法上点击字母n
void doXue3(){
	Log.i(TAG, "doXue3-----------------");
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
              //在弹出的输入法上点击字母n
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 1 330 1;");
              dataOut.writeBytes("sendevent /dev/input/event4 3 53 517;");
              dataOut.writeBytes("sendevent /dev/input/event4 3 54 1123;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 1 330 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");

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

//点击发送按钮
void doXue4(){
	Log.i(TAG, "doXue4-----------------");
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
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 1 330 1;");
              dataOut.writeBytes("sendevent /dev/input/event4 3 53 658;");
              dataOut.writeBytes("sendevent /dev/input/event4 3 54 639;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 1 330 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");

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


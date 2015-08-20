package com.tt.servic;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	static String TAG = "diaoliang";
	TextView tv_infor = null;
	Button btn_start = null;
	Button btn_over = null;
	Button btn_input = null;
	ImageView img_image = null;
	EditText tv_input = null;//btn_reset
	Button btn_reset = null;
	
	boolean flag = false;
	
	
	 @Override
		public boolean onTouchEvent(MotionEvent event) {
			// TODO Auto-generated method stub
	    	
	    	float XOffset = event.getX();
	    	float YOffest = event.getY();
	    	Toast.makeText(this, "X:"+XOffset + ";Y:" + YOffest, Toast.LENGTH_SHORT).show();
	    	
			return super.onTouchEvent(event);
		}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initview();
		bindlisteners();
	}

	private void initview() {
		// TODO Auto-generated method stub
		tv_infor = (TextView)findViewById(R.id.tv_infor);
		btn_start = (Button)findViewById(R.id.btn_start);
		btn_over = (Button)findViewById(R.id.btn_over);
		btn_input = (Button)findViewById(R.id.btn_input);
		img_image  = (ImageView)findViewById(R.id.img_image);
		tv_input  = (EditText)findViewById(R.id.tv_input);
		//btn_reset = (Button)findViewById(R.id.btn_reset);
	}

	private void bindlisteners() {
		// TODO Auto-generated method stub
		final Intent intent = new Intent();
		intent.setAction("com.tt.servic.MyService");  
		btn_start.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.i(TAG, "开启服务");
				startService(intent);
				//doXue(tv_input.getText().toString());
			}
		});
		
		
		btn_over.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i(TAG, "关闭服务");
				stopService(intent);
				//tv_infor.setText("");
				//tv_input.setText("sendevent /dev/input/event4 0 0 0;sendevent /dev/input/event4 1 330 1;sendevent /dev/input/event4 3 48 1;sendevent /dev/input/event4 3 53 580;sendevent /dev/input/event4 3 54 483;sendevent /dev/input/event4 0 0 0;sendevent /dev/input/event4 1 330 0;sendevent /dev/input/event4 0 2 0;sendevent /dev/input/event4 0 0 0;sendevent /dev/input/event4 0 0 0;");  
				
			}
		});
		
		btn_input.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i(TAG, "代码注入");
				//runStartServerCMD();
				//doXue();
				tv_infor.setText("success");

			}
		});
		
		
		img_image.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(flag)
				img_image.setImageResource(R.drawable.two);
				else
					img_image.setImageResource(R.drawable.one);
				flag = !flag;
			}
		});
		
		
	}


void do_exec(String[] cmds) {
	String s = "\n";
	try {
		Process p = Runtime.getRuntime().exec(cmds);
		BufferedReader in = new BufferedReader(
							new InputStreamReader(p.getInputStream()));
		String line = null;
		while ((line = in.readLine()) != null) {
			s += line + "\n";	
			Log.i(TAG, line);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	tv_infor.setText(s);
   	
}


void doXue(){
 
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
              
              //经过试验 完全不用考虑斜杠问题 必须要加分号 否则会注入失败
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 1 330 1;");
              dataOut.writeBytes("sendevent /dev/input/event4 3 48 1;");
              dataOut.writeBytes("sendevent /dev/input/event4 3 53 580;");
              dataOut.writeBytes("sendevent /dev/input/event4 3 54 483;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 1 330 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 2 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");
              dataOut.writeBytes("sendevent /dev/input/event4 0 0 0;");

              dataOut.flush();
              dataOut.close();
              process.waitFor();
              while ((line = err.readLine()) != null) {
                 Log.i(TAG,line);
                 tv_infor.setText(line);
          }
              while ((line = bufferReader.readLine()) != null) {
              	Log.i(TAG,line);
              	tv_infor.setText(line);
              }
      } catch (Exception e) {
              e.printStackTrace();
              tv_infor.setText(e.getMessage());
      }finally{

      }
	
}


void doXue(String cmd){
	 
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

            dataOut.writeBytes(cmd);

            dataOut.flush();
            dataOut.close();
            process.waitFor();
            while ((line = err.readLine()) != null) {
               Log.i(TAG,line);
               tv_infor.setText(line);
        }
            while ((line = bufferReader.readLine()) != null) {
            	Log.i(TAG,line);
            	tv_infor.setText(line);
            }
    } catch (Exception e) {
            e.printStackTrace();
            tv_infor.setText(e.getMessage());
    }finally{

    }
	
}
}

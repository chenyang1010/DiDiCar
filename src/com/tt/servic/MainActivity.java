package com.tt.servic;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	static String TAG = "MainActivity";
	TextView tv_infor = null;
	Button btn_start = null;
	Button btn_over = null;
	boolean flag = false;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initview();
		bindlisteners();
	}

	private void initview() {
		tv_infor = (TextView)findViewById(R.id.tv_infor);
		btn_start = (Button)findViewById(R.id.btn_start);
		btn_over = (Button)findViewById(R.id.btn_over);
	}

	private void bindlisteners() {
		final Intent intent = new Intent();
		intent.setAction("com.tt.servic.MyService");  
		btn_start.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Log.i(TAG, "开启服务");
				startService(intent);//开启后台监听服务
			}
		});
		
		btn_over.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Log.i(TAG, "关闭服务");
				stopService(intent);//关闭后台服务
			}
		});
		
	}
}

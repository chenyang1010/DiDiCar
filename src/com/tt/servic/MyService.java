package com.tt.servic;


import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.IBinder;

public class MyService extends Service {
	
	static String TAG = "MyService";
	boolean flag = true;
	private AudioManager am = null;
	private boolean audioLis = true;    //服务进程开关，决定服务进程的结束与否
	private int preVolum = -1;
	private boolean toggle = false;    //声音变化按钮，如果变化就需要出发点击动作
    @Override
    public IBinder onBind(Intent intent) {
	     return null;
    }

    @Override
    public void onCreate() {
	   // Log.i(TAG, "Service-----------------created");
	    super.onCreate();
	    am =  (AudioManager)this.getSystemService(Context.AUDIO_SERVICE);
	    preVolum = am.getStreamVolume(AudioManager.STREAM_RING );
	    Thread thread = new Thread() {
	    @Override
	    public void run() {
			//Log.i(TAG, "Service-----------------");
			while(audioLis) {
				int  curVolum = am.getStreamVolume(AudioManager.STREAM_RING );
				//Log.i(TAG, "curVolum:"+curVolum+";preVolum:"+preVolum+"-----------------");
				if (curVolum != preVolum) {
					//Log.i(TAG, "curVolum"+curVolum+"preVolum"+preVolum+"-----------------");
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
	     // Log.i(TAG, "MyService-----------------Destroyed");
	     audioLis = false;
	     Intent intent = new Intent();
	     intent.setAction("com.tt.servic.ActionService");
	     stopService(intent);
	     super.onDestroy();
	 }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
	   return super.onStartCommand(intent, flags, startId);
    }

}


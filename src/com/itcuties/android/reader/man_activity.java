package com.itcuties.android.reader;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class man_activity extends Activity {
	
	protected  int SPLASH_TIME_OUT =5000;

		
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
		  setContentView(R.layout.activity_main);
		  
		  new Handler().postDelayed( new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent I = new Intent(man_activity.this,man_lamar.class);
			    startActivity(I);
			    finish();
			
			}
		}, SPLASH_TIME_OUT);
		}
	
	}

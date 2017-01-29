package com.itcuties.android.reader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class man_lamar extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	  setContentView(R.layout.lamar);
	  
	  Button gaza = (Button) findViewById(R.id.button9);
	  Button khan_yunis = (Button) findViewById(R.id.button8);
	  Button rafah = (Button) findViewById(R.id.button5);
	  Button middle_gaza = (Button) findViewById(R.id.button7);
	  Button north_gaza = (Button) findViewById(R.id.button10);
	  Button RSS = (Button) findViewById(R.id.button6);

	   RSS.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent irss = new Intent(man_lamar.this,ITCutiesReaderAppActivity.class);
				startActivity(irss);
			
			}
		});
	  
	  
	  gaza.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent igaza = new Intent(man_lamar.this,man_gaza.class);
			startActivity(igaza);
		
		}
	});
	  
	  khan_yunis.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ikhan_yunis = new Intent(man_lamar.this,man_khan_yunis.class);
				startActivity(ikhan_yunis);
			
			}
		});
	  
	  rafah.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent irafah = new Intent(man_lamar.this,man_rafah.class);
				startActivity(irafah);
			
			}
		});
	  
	  middle_gaza.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent imiddle_gaza = new Intent(man_lamar.this,man_middle_gaza.class);
				startActivity(imiddle_gaza);
			
			}
		});
	  
	  north_gaza.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent north_gaza = new Intent(man_lamar.this,man_north_gaza.class);
				startActivity(north_gaza);
			
			}
		});
	
	}
	
}

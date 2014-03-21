package com.example.jforest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		final ImageView vote = (ImageView) findViewById(R.id.vote);
//		
//		vote.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View vote) {
//				if (vote.isActivated()) {
//					vote.setActivated(false);
//				}
//				else {
//					vote.setActivated(true);
//				}
//			}
//		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

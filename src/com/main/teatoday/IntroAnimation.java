package com.main.teatoday;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class IntroAnimation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intro_animation);
		
		try {
		    new Handler().postDelayed(new Runnable() {
		        public void run() {

		        	Intent mainActivity = new Intent(IntroAnimation.this,MainActivity.class);
		            startActivity(mainActivity);
		            //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
		            IntroAnimation.this.finish();
		        }
		    }, 5000);
		    } catch(Exception e){}
	}
	/*
	public void gotoMain(View view) {
		Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
	}*/
}

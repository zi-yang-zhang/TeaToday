package com.main.teatoday;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;

import com.choosetea.teatoday.RandomTea;

public class MainActivity extends Activity {
	int teaType = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void randomTeaGenerator(View view){
		CheckBox check = (CheckBox) findViewById(R.id.teaType);
		boolean checked = check.isChecked();
        if (checked){
        	final ArrayList teaTypes = new ArrayList();  // Where we track the selected items
    	    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	    // Set the dialog title
    	    builder.setTitle(R.string.tea_type_dialog_title)
    	    // Specify the list array, the items to be selected by default (null for none),
    	    // and the listener through which to receive callbacks when items are selected
    	  
    	           .setMultiChoiceItems(R.string., null,
    	                      new DialogInterface.OnMultiChoiceClickListener() {
    	               @Override
    	               public void onClick(DialogInterface dialog, int which,
    	                       boolean isChecked) {
    	                   if (isChecked) {
    	                       // If the user checked the item, add it to the selected items
    	                	   teaTypes.add(which);
    	                   } else if (teaTypes.contains(which)) {
    	                       // Else, if the item is already in the array, remove it 
    	                	   teaTypes.remove(Integer.valueOf(which));
    	                   }
    	               }
    	           })
    	    // Set the action buttons
    	           .setPositiveButton("ok", new DialogInterface.OnClickListener() {
    	               @Override
    	               public void onClick(DialogInterface dialog, int id) {
    	            	   
    	               }
    	           })
    	           .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
    	               @Override
    	               public void onClick(DialogInterface dialog, int id) {
    	            	   
    	               }
    	           });
        	
        }else{
        	
        };
		AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        dlgAlert.setMessage(RandomTea.teaType(teaType));
        dlgAlert.setTitle("Your Tea Today!");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
	}
	
}

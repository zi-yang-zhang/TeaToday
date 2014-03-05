package com.main.teatoday;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.choosetea.teatoday.RandomTea;

public class MainActivity extends Activity {
	int teaType = 5;
	boolean withMilk = false;
	boolean latte = false;
	boolean jelly = false;
	boolean herb = false;
	boolean pearl = false;
	boolean hot = false;
	boolean cold = false;
	RandomTea randomTeaGenerator = new RandomTea();
	

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
		
		AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        dlgAlert.setMessage(randomTeaGenerator.teaType(teaType,withMilk,latte,hot,cold,herb,jelly,pearl))
        	.setTitle("Your Tea Today!")
        	.setPositiveButton("OK", null)
        	.setCancelable(true);
        dlgAlert.create().show();
	}
	public void choosePreferences(View view){
		
        
		boolean checked = ((CheckBox) view).isChecked();
		
		final TextView teaTypeText = (TextView) findViewById(R.id.teaTypeText);
		final TextView milkText = (TextView) findViewById(R.id.milkText);
		final TextView latteText = (TextView) findViewById(R.id.latteText);
		final TextView hotOrColdText = (TextView) findViewById(R.id.hotOrColdText);
		final TextView jellyText = (TextView) findViewById(R.id.jellyText);
		final TextView herbText = (TextView) findViewById(R.id.herbText);
		final TextView tapiocaPearlText = (TextView) findViewById(R.id.tapiocaPearlText);
		final CheckBox milkCheckBox = (CheckBox)findViewById(R.id.milkCheckBox);
		final CheckBox latteCheckBox = (CheckBox)findViewById(R.id.latteCheckBox);
		final CheckBox coldCheckBox = (CheckBox)findViewById(R.id.coldCheckBox);
		final CheckBox hotCheckBox = (CheckBox)findViewById(R.id.hotCheckBox);
		switch(view.getId()) {
        case R.id.teaTypeCheckBox:
            if (checked){
            	AlertDialog.Builder builder = new AlertDialog.Builder(this);
	        	builder.setTitle(R.string.tea_type_dialog_title)
	            .setItems(R.array.tea_type_array, new DialogInterface.OnClickListener() {
	                public void onClick(DialogInterface dialog, int which) {
	                // The 'which' argument contains the index position
	                // of the selected item
	                	String[] teaTypeArray = getResources().getStringArray(R.array.tea_type_array);
	                	teaType = which;
	                	teaTypeText.setText(teaTypeArray[which]);
	                }
	            });
	        	AlertDialog dialog = builder.create();
	        	dialog.show();}
            else{
            	teaType = 5;
            	teaTypeText.setText("");
            }
            break;
        case R.id.milkCheckBox:
        	
            if (checked){
            	withMilk = true;
            	milkText.setText("With Milk");
            }
            else{
            	latteCheckBox.setChecked(false);
            	latte = false;
            	latteText.setText("");
            	withMilk = false;
            	milkText.setText("");
            }
            break;
        case R.id.latteCheckBox:
            if (checked){
            	milkCheckBox.setChecked(true);
            	latte = true;
            	latteText.setText("Latte");
            	withMilk = true;
            	milkText.setText("With Milk");
            }
            else{
            	latte = false;
            	latteText.setText("");
            }
            break;
        case R.id.hotCheckBox:
            if (checked){
            	hot = true;
            	cold = false;
                coldCheckBox.setChecked(false);
            	hotOrColdText.setText("Hot");
            }
            else{
            	hot = false;
            	hotOrColdText.setText("");
            }
            break;
        case R.id.coldCheckBox:
            if (checked){
            	cold = true;
            	hot = false;
            	hotCheckBox.setChecked(false);
            	hotOrColdText.setText("Cold");
            }
            else{
            	cold = false;
            	hotOrColdText.setText("");
            }
            break;
        case R.id.jellyCheckBox:
            if (checked){
            	jelly = true;
            	jellyText.setText("With Jelly");
            }
            else{
            	jelly = false;
            	jellyText.setText("");
            }
            break;
        case R.id.herbCheckBox:
            if (checked){
            	herb = true;
            	herbText.setText("With Herb");
            }
            else{
            	herb = false;
            	herbText.setText("");
            }
            break;
        case R.id.tapiocaPearlCheckBox:
            if (checked){
            	pearl = true;
            	tapiocaPearlText.setText("With Tapioca Pearl");
            }
            else{
            	pearl = false;
            	tapiocaPearlText.setText("");
            }
            break;
    }
		
	}

	
}

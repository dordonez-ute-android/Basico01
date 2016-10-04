package com.example.testfirst;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void muestraMensaje(View view) {
		EditText et = (EditText) findViewById(R.id.et1);
		Toast.makeText(this, et.getText(), Toast.LENGTH_LONG).show();
	}
}

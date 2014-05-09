package com.example.protest;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class Data extends Activity implements View.OnClickListener{

	Button start, startFor;
	EditText sendET;
	TextView gotAnswer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get);
		init();
	}
	
	private void init(){
		start = (Button)findViewById(R.id.bSA);
		startFor=(Button)findViewById(R.id.bSAFR);
		sendET=(EditText)findViewById(R.id.etSend);
		gotAnswer=(TextView)findViewById(R.id.tvGOT);
		start.setOnClickListener(this);
		startFor.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bSA:
			String bread = sendET.getText().toString();
			Bundle basket = new Bundle();
			basket.putString("key", bread);
			Intent a = new Intent(Data.this, OpenedClass.class);
			a.putExtras(basket);
			startActivity(a);
			break;
		case R.id.bSAFR:
			Intent i = new Intent(Data.this, OpenedClass.class);
			startActivityForResult(i, 0);
			break;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	}
	
	

}

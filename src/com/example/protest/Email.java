package com.example.protest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Email extends Activity implements OnClickListener {

	EditText personEmail, intro, personName, stupidThing, hatefull, outro;
	String emailAdd, begin, name, stupidAction, hatefulAct, out;
	Button sendEmail;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
		initializzeVars();
		sendEmail.setOnClickListener(this);
	}

	private void initializzeVars() {
		personEmail = (EditText) findViewById(R.id.etEmail);
		intro = (EditText) findViewById(R.id.etIntro);
		personName = (EditText) findViewById(R.id.etName);
		stupidThing = (EditText) findViewById(R.id.etStupid);
		hatefull = (EditText) findViewById(R.id.etAction);
		outro = (EditText) findViewById(R.id.etOutro);
		sendEmail = (Button) findViewById(R.id.btnSendEmail);
	}

	private void getStrings() {
		emailAdd = personEmail.getText().toString();
		begin = intro.getText().toString();
		name = personName.getText().toString();
		stupidAction=stupidThing.getText().toString();
		hatefulAct=hatefull.getText().toString();
		out=outro.getText().toString();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		getStrings();
		String emailAddress[]={emailAdd};
		
		String message = "Well Hello"
				+name
				+"I just want to say"
				+ begin
				+ "not only that but I hate you"
				+ stupidAction
				+ hatefulAct
				+out;
		
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailAddress);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Test Mail");
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(emailIntent);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	

}

package com.HelloWorld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldApplicationActivity extends Activity {
    /** Called when the activity is first created. */
	
	EditText et1;
	TextView tv1;
	Button b;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        et1=(EditText) findViewById(R.id.editText1);
        tv1=(TextView) findViewById(R.id.textView1);
        b=(Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String s1=et1.getText().toString();
				tv1.setText(s1);
				
			}
		});
    }
}
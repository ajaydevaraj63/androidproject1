package com.example.test12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
AppCompatButton b1,b2;
String getName,getAdd,getPhno,getEmailid,getUsername,getPassword,getconfirmPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ed1=(EditText) findViewById(R.id.ed1);
        ed2=(EditText) findViewById(R.id.ed2);
        ed3=(EditText) findViewById(R.id.ed3);
        ed4=(EditText) findViewById(R.id.ed4);
        ed5=(EditText) findViewById(R.id.ed5);
        ed6=(EditText) findViewById(R.id.ed6);
        ed7=(EditText) findViewById(R.id.ed7);
        b1=(AppCompatButton) findViewById(R.id.b1);
        b2=(AppCompatButton) findViewById(R.id.b2_l);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getAdd=ed2.getText().toString();
                getPhno=ed3.getText().toString();
                getEmailid=ed4.getText().toString();
                getUsername=ed5.getText().toString();
                getPassword=ed6.getText().toString();
                getconfirmPass=ed7.getText().toString();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(t);

            }
        });




    }
}
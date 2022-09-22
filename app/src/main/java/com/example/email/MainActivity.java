package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView label;
    EditText email;
    String emailStr;
    Boolean valid = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        check = (Button) findViewById(R.id.button);
        label = (TextView) findViewById(R.id.label);


//        check.setOnClickListener (new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                helloWorld.setVisibility(View.VISIBLE);
//            }
//        });
    }

    public void checkEmail(View v){
        email = (EditText) findViewById(R.id.email);
        emailStr = email.getText().toString();

        if(CheckEmail.checkEmail(emailStr)){
            label.setTextColor(getResources().getColor(R.color.green));
            label.setText("VALID");
        }else{
            label.setTextColor(getResources().getColor(R.color.red));
            label.setText("INVALID");
        }

        valid = false;
    }
}
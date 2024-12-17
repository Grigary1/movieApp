package com.hospital.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    String getUname , getPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.username);
        e2=(EditText) findViewById(R.id.password);
        b1=(Button) findViewById(R.id.loginBtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUname=e1.getText().toString();
                getPass=e2.getText().toString();
                System.out.println(getUname);
                System.out.println(getPass);
                if(getUname.equals("theatre")&&getPass.equals("123456")){
                    Intent ob=new Intent(getApplicationContext(), DashboardActivity.class);
                    startActivity(ob);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG);
                }
            }
        });
    }
}
package com.hospital.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddMoviesActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    Button b1,b2;
    String getMovie,getLang,getDir,getActor,getActress,getYear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_movies);
        e1=(EditText) findViewById(R.id.movieName);
        e2=(EditText) findViewById(R.id.language);
        e3=(EditText) findViewById(R.id.dirName);
        e4=(EditText) findViewById(R.id.actorName);
        e5=(EditText) findViewById(R.id.actressName);
        e6=(EditText) findViewById(R.id.year);
        b1=(Button) findViewById(R.id.submit);
        b2=(Button) findViewById(R.id.backtoMain);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMovie=e1.getText().toString();
                getLang=e2.getText().toString();
                getDir=e3.getText().toString();
                getActor=e4.getText().toString();
                getActress=e5.getText().toString();
                getYear=e6.getText().toString();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });
    }
}
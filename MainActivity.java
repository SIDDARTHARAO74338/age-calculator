package com.codewithsr.agecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button agebutton = (Button) findViewById(R.id.agebutton);
        agebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);


                String age = editText1.getText().toString().trim();
                int year = Calendar.getInstance().get(Calendar.YEAR);

                int result1 = year - Integer.parseInt(age);
                int result2 = 60 - result1;
                int result3 = year + result2;

                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                intent.putExtra("Message1", "" + result1);
                intent.putExtra("Message2", "" + result2);
                intent.putExtra("Message3", "" + result3);
                startActivity(intent);

                if (age.isEmpty()) {
                    editText1.setError("Please Enter Titel");
                    Toast.makeText(MainActivity.this, "Please Enter Birth Year", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button about = findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent about = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(about);
            }
        });

    }
}
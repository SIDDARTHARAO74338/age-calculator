package com.codewithsr.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView TextView1;
    private TextView TextView2;
    private TextView TextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView1 = findViewById(R.id.textView1);
        TextView2 = findViewById(R.id.textView2);
        TextView3 = findViewById(R.id.textView3);

        TextView1.setText(getIntent().getExtras().getString("Message1"));
        TextView2.setText(getIntent().getExtras().getString("Message2"));
        TextView3.setText(getIntent().getExtras().getString("Message3"));


    }
}
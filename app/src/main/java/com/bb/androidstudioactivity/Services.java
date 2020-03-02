package com.bb.androidstudioactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        Button sActivityButton = (Button) findViewById(R.id.goback_button2);

        sActivityButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                finish();
            }
        });}}
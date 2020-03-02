package com.bb.androidstudioactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;

public class Broadcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);

        Button cBroadcastButton = (Button) findViewById(R.id.back_button2);
        Button amberButton = (Button) findViewById(R.id.amberView3);

        cBroadcastButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });

            Toast.makeText(Broadcast.this,"AMBER ALERT!", Toast.LENGTH_LONG).show();
            }
        }
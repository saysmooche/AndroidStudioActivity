package com.bb.androidstudioactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        Button openActivityButton = (Button) findViewById(R.id.activity_button2);
        Button openBroadcastButton = (Button) findViewById(R.id.broadcast_button4);
        Button openServicesButton = (Button) findViewById(R.id.services_button);
        Button openContentButton = (Button) findViewById(R.id.content_button3);
        Button closeActivityButton = (Button) findViewById(R.id.close_button);

        closeActivityButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                    finish();
                    }
        });

        openActivityButton.setOnClickListener(new View.OnClickListener() {
              public void onClick(View view) {
                  Intent intentA = new Intent(MainActivity.this, Activity.class);
                  startActivity(intentA);
              }
          });
            openBroadcastButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intentB = new Intent(MainActivity.this, Broadcast.class);
                    startActivity(intentB);
                }
            });
        openContentButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intentC = new Intent(MainActivity.this, Content.class);
                startActivity(intentC);
            }
        });
        openServicesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intentD = new Intent( MainActivity.this, Services.class);
                startActivity(intentD);
            }
            });
            }
        }

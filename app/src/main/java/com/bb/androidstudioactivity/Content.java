package com.bb.androidstudioactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;

public class Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_content);

        Button openUpdateButton = (Button) findViewById(R.id.buttonupdate);
        Button openInsertButton = (Button) findViewById(R.id.buttoninsert);
        Button openDeleteButton = (Button) findViewById(R.id.buttondelete);
        Button openGetButton = (Button) findViewById(R.id.buttongettype);
        Button openQButton = (Button) findViewById(R.id.buttonquery);
        Button openOCButton = (Button) findViewById(R.id.buttoncreate);
        Button cActivityButton = (Button) findViewById(R.id.back_button);
        final EditText inputEditText = findViewById(R.id.editTextquiz);
        final Button displayText = (Button) findViewById(R.id.submit_button);

        displayText.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {

               if(inputEditText.getText().toString() == "gettype")
               {
                   Intent intentK = new Intent(Content.this, PopQuiz_1.class);
                   intentK.putExtra("Value", inputEditText.getText().toString());
                   startActivity(intentK);
                   finish();
               }else  {
                   Intent intentP = new Intent(Content.this, quiz_question2.class);
                   intentP.putExtra("Value", inputEditText.getText().toString());
                   startActivity(intentP);
                   finish();
               }
           }
       });

        cActivityButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                finish();
            }
        });

        openUpdateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intentF = new Intent(Content.this, content_providers.class);
                startActivity(intentF);
            }
        });
        openInsertButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intentE = new Intent(Content.this, content_providers.class);
                startActivity(intentE);
            }
        });
        openDeleteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intentG = new Intent(Content.this, content_providers.class);
                startActivity(intentG);
            }
        });
        openGetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intentH = new Intent(Content.this, content_providers.class);
                startActivity(intentH);
            }
        });
        openQButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intentI = new Intent(Content.this, content_providers.class);
                startActivity(intentI);
            }
        });
        openOCButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intentJ = new Intent(Content.this, content_providers.class);
                startActivity(intentJ);
            }
        });

        String input = inputEditText.getText().toString().trim();
        Intent intent2 = new Intent(Content.this, PopQuiz_1.class);

        if(input.length() == 0) {
            Toast.makeText(Content.this,"POP QUIZ!", Toast.LENGTH_LONG).show();
        }
        else{
            intent2.putExtra(PopQuiz_1.ACTIVITY_SERVICE, input);
            startActivity(intent2);
        }
        }
    }

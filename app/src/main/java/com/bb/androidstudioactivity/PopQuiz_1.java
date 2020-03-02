package com.bb.androidstudioactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Objects;

public class PopQuiz_1 extends AppCompatActivity {

    TextView receive;
    String receivetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_quiz_1);

        receive = findViewById(R.id.editTextquiz);
        receivetext = Objects.requireNonNull(getIntent().getExtras()).getString( "Value");
        Button cloActivityButton = (Button) findViewById(R.id.back_button5);

        cloActivityButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }
}
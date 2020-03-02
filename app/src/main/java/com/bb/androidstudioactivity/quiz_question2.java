package com.bb.androidstudioactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class quiz_question2 extends AppCompatActivity {
    TextView receive;
    String receivetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_question2);

        receive = findViewById(R.id.editTextquiz);
        receivetext = Objects.requireNonNull(getIntent().getExtras()).getString("Value");
        Button closeitActivityButton = (Button) findViewById(R.id.back_button4);

        closeitActivityButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }
}

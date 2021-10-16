package com.example.android.hackitout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView javaCourse = findViewById(R.id.java_text_view);
        javaCourse.setOnClickListener(view -> {
            Intent javaIntent = new Intent(this, javaCourse.class);
            startActivity(javaIntent);
        });

        TextView pythonCourse = findViewById(R.id.python_text_view);
        pythonCourse.setOnClickListener(view -> {
            Intent pythonIntent = new Intent(this, pythonCourse.class);
            startActivity(pythonIntent);
        });

        TextView aiCourse = findViewById(R.id.ai_text_view);
        aiCourse.setOnClickListener(view -> {
            Intent aiIntent = new Intent(this, aiCourse.class);
            startActivity(aiIntent);
        });
    }
}
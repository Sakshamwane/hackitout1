package com.example.android.hackitout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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

        ImageView javaCourseimg = findViewById(R.id.java_img);
        javaCourseimg.setOnClickListener(view -> {
            Intent javaIntent = new Intent(this, javaCourse.class);
            startActivity(javaIntent);
        });

        TextView pythonCourse = findViewById(R.id.python_text_view);
        pythonCourse.setOnClickListener(view -> {
            Intent pythonIntent = new Intent(this, pythonCourse.class);
            startActivity(pythonIntent);
        });

        ImageView pythonCourseimg = findViewById(R.id.python_img);
        pythonCourseimg.setOnClickListener(view -> {
            Intent pythonIntent = new Intent(this, pythonCourse.class);
            startActivity(pythonIntent);
        });

        TextView cCourse = findViewById(R.id.c_text_view);
        cCourse.setOnClickListener(view -> {
            Intent cIntent = new Intent(this, cppCourse.class);
            startActivity(cIntent);
        });

        ImageView cCourseimg = findViewById(R.id.c_img);
        cCourseimg.setOnClickListener(view -> {
            Intent cIntent = new Intent(this, cppCourse.class);
            startActivity(cIntent);
        });

        TextView dsCourse = findViewById(R.id.ds_text_view);
        dsCourse.setOnClickListener(view -> {
            Intent dsIntent = new Intent(this, dsCourse.class);
            startActivity(dsIntent);
        });

        ImageView dsCourseimg = findViewById(R.id.ds_img);
        dsCourseimg.setOnClickListener(view -> {
            Intent dsIntent = new Intent(this, dsCourse.class);
            startActivity(dsIntent);
        });

        TextView wdCourse = findViewById(R.id.wd_text_view);
        wdCourse.setOnClickListener(view -> {
            Intent wdIntent = new Intent(this, webCourse.class);
            startActivity(wdIntent);
        });

        ImageView wdCourseimg = findViewById(R.id.wd_img);
        wdCourseimg.setOnClickListener(view -> {
            Intent wdIntent = new Intent(this, webCourse.class);
            startActivity(wdIntent);
        });

        TextView mlCourse = findViewById(R.id.ml_text_view);
        mlCourse.setOnClickListener(view -> {
            Intent mlIntent = new Intent(this, mlCourse.class);
            startActivity(mlIntent);
        });

        ImageView mlCourseimg = findViewById(R.id.ml_img);
        mlCourseimg.setOnClickListener(view -> {
            Intent mlIntent = new Intent(this, mlCourse.class);
            startActivity(mlIntent);
        });

        TextView aiCourse = findViewById(R.id.ai_text_view);
        aiCourse.setOnClickListener(view -> {
            Intent aiIntent = new Intent(this, aiCourse.class);
            startActivity(aiIntent);
        });

        ImageView aiCourseimg = findViewById(R.id.ai_img);
        aiCourseimg.setOnClickListener(view -> {
            Intent aiIntent = new Intent(this, aiCourse.class);
            startActivity(aiIntent);
        });

        TextView dscCourse = findViewById(R.id.dsc_text_view);
        dscCourse.setOnClickListener(view -> {
            Intent dscIntent = new Intent(this, dscCourse.class);
            startActivity(dscIntent);
        });

        ImageView dscCourseimg = findViewById(R.id.dsc_img);
        dscCourseimg.setOnClickListener(view -> {
            Intent dscIntent = new Intent(this, dscCourse.class);
            startActivity(dscIntent);
        });


    }
}
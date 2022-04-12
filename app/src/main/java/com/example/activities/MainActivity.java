package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("==>", "MainActivity Created.");



        signin = findViewById(R.id.sign_in_button);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    public MainActivity() {
        super();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Log.d("==>", "MainActivity Resumed.");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("==>", "MainActivity Started.");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("==>", "MainActivity Stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("==>", "MainActivity Destroyed.");
    }
}





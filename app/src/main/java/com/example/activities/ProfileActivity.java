package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {


    private Button signout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        signout = findViewById(R.id.sign_out_button);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();


        String username = extras.getString("username");
        Log.d("==>", "Username from intent" + username);


        signout.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                Log.d("==>", "Sign out button");
                finish();



            }
        });
    }







public ProfileActivity() {
        super();
        }

@Override
protected void onPostResume() {
        super.onPostResume();

        Log.d("==>", "ProfileActivity Resumed.");
        }

@Override
protected void onStart() {
        super.onStart();

        Log.d("==>", "ProfileActivity Started.");
        }

@Override
protected void onStop() {
        super.onStop();

        Log.d("==>", "ProfileActivity Stopped.");
        }

@Override
protected void onDestroy() {
        super.onDestroy();

        Log.d("==>", "ProfileActivity Destroyed.");
        }
        }





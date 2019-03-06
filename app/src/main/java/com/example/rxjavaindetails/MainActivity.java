package com.example.rxjavaindetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstExample(View view) {
        startActivity(new Intent(getApplicationContext(), FirstExampleActivity.class));
    }

    public void secondExample(View view) {
        startActivity(new Intent(getApplicationContext(), SecondExampleActivity.class));
    }
}

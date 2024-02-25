package com.android.fibmobapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class GpsGui extends Activity implements View.OnClickListener {
    private static final int ACTIVITY_CREATE = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button login = findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, SecondPage.class);
        startActivityForResult(i, ACTIVITY_CREATE);
    }
}


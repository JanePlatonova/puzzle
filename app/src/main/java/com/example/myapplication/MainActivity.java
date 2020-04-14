package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.layout_frame);
        setContentView(R.layout.layout_relative);
        View v11=(View) findViewById(R.id.view11);
        View v12=(View)findViewById(R.id.view12);
        View v13=(View)findViewById(R.id.view13);
        View v21=(View)findViewById(R.id.view21);
        View v22=(View)findViewById(R.id.view22);
        View v23=(View)findViewById(R.id.view23);
        v11.setOnClickListener(this);
        v12.setOnClickListener(this);
        v13.setOnClickListener(this);
        v21.setOnClickListener(this);
        v22.setOnClickListener(this);
        v23.setOnClickListener(this);



    }


    private  int  orientation;

    @Override
    public void onClick(View v) {
        v.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onStop() {
        Log.i("e","stop");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.i("44444444444","resume");
        super.onResume();
    }
}



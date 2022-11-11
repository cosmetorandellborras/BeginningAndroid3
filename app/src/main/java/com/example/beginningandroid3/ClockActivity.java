package com.example.beginningandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class ClockActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);

        btn = new Button(this);
        btn.setOnClickListener(this);
        updateTime();
        setContentView(btn);

    }

    @Override
    public void onClick(View view) {
        updateTime();
    }
    public void updateTime(){
        btn.setText(new Date().toString());
    }
}
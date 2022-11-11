package com.example.beginningandroid3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (AppCompatButton) findViewById(R.id.activity1);
        b1.setOnClickListener(this);
        b2 = (AppCompatButton) findViewById((R.id.button2));
        b2.setOnClickListener(this);
        b3 = (AppCompatButton) findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b4 = (AppCompatButton) findViewById(R.id.button4);
        b4.setOnClickListener(this);
        b5 = (AppCompatButton) findViewById(R.id.button5);
        b5.setOnClickListener(this);
        b6 = (AppCompatButton) findViewById(R.id.button6);
        b6.setOnClickListener(this);
        b7 = (AppCompatButton) findViewById(R.id.button7);
        b7.setOnClickListener(this);
        b8 = (AppCompatButton) findViewById(R.id.button8);
        b8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.activity1:  intent = new Intent(getApplicationContext(), ClockActivity.class);
            startActivity(intent); break;
            case R.id.button2:  intent = new Intent(getApplicationContext(), ClockActivity2.class);
            startActivity(intent); break;
            case R.id.button3: intent = new Intent (getApplicationContext(), LinearLayoutRadioButtons.class);
            startActivity(intent); break;
            case R.id.button4: intent = new Intent (getApplicationContext(), LinearLayoutWeight.class);
            startActivity(intent); break;
            case R.id.button5: intent = new Intent (getApplicationContext(),RelativeLayoutDemo.class);
            startActivity(intent); break;
            case R.id.button6: intent = new Intent (getApplicationContext(),OverleapDemo.class);
            startActivity(intent); break;
            case R.id.button7: intent = new Intent (getApplicationContext(), TableLayoutDemo.class);
            startActivity(intent); break;
            case R.id.button8: intent = new Intent(getApplicationContext(), Scrollwork.class);
            startActivity(intent); break;

        }
    }
}
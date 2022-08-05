package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button first =(Button)findViewById(R.id.button);
        Button second =(Button)findViewById(R.id.button2);
        Button three =(Button)findViewById(R.id.button3);
        Button four =(Button)findViewById(R.id.button4) ;
        TextView enter = (TextView)findViewById(R.id.enter);
        TextView number = (TextView)findViewById(R.id.number1);
        TextView numberr = (TextView)findViewById(R.id.number2);
    }
}
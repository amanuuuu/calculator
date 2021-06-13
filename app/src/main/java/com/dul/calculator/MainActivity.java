package com.dul.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import  android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView t1;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        t1=(TextView) findViewById(R.id.T1);

    }

    public void button1(View view) {
        int adhra=Integer.parseInt(e1.getText().toString());
        int adhra1=Integer.parseInt(e2.getText().toString());
        int sum=adhra+adhra1;
        t1.setText(String.valueOf(sum));
    }

    public void button2(View view) {
        int adhra=Integer.parseInt(e1.getText().toString());
        int adhra1=Integer.parseInt(e2.getText().toString());
        int sum=adhra-adhra1;
        t1.setText(String.valueOf(sum));
    }

    public void button3(View view) {
        int adhra=Integer.parseInt(e1.getText().toString());
        int adhra1=Integer.parseInt(e2.getText().toString());
        int sum=adhra*adhra1;
        t1.setText(String.valueOf(sum));
    }

    public void button4(View view) {
        int adhra=Integer.parseInt(e1.getText().toString());
        int adhra1=Integer.parseInt(e2.getText().toString());
        int sum=adhra/ adhra1;
        t1.setText(String.valueOf(sum));
    }
}
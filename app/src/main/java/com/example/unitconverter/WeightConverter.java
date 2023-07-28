package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WeightConverter extends AppCompatActivity {
    TextView t1,t2,t3;
    Button b1,b2,b3;
    EditText e1;
    Double r1,r2,value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_converter);
        e1=(EditText)findViewById(R.id.edit1);
        t1=(TextView)findViewById(R.id.text1);
        t2=(TextView)findViewById(R.id.text3);
        t3=(TextView)findViewById(R.id.text4);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("gram to convert kg,pound");
                value=Double.parseDouble(e1.getText().toString());
                r1=value/1000;
                String s=String.valueOf(r1);
                t2.setText(s+"kg");

                r2=value*0.0022;
                String s1=String.valueOf(r2);
                t3.setText(s1+"lb");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("kilogram to convert gram,pound");
                value=Double.parseDouble(e1.getText().toString());
                r1=value*1000;
                String s=String.valueOf(r1);
                t2.setText(s+"g");

                r2=value*2.205;
                String s1=String.valueOf(r2);
                t3.setText(s1+"lb");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("pound to convert gram,kilogram");
                value=Double.parseDouble(e1.getText().toString());
                r1=value*453.592;
                String s=String.valueOf(r1);
                t2.setText(s+"g");

                r2=value*0.454;
                String s1=String.valueOf(r2);
                t3.setText(s1+"kg");
            }
        });
    }
}
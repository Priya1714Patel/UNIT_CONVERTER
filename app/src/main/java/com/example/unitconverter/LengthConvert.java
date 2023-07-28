package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LengthConvert extends AppCompatActivity {
    EditText e1;
    TextView t1,t2,t3,t4;
    Button b1,b2,b3,b4;
    double r1,r2,r3,value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_convert);
        e1=(EditText)findViewById(R.id.edit1);
        t1=(TextView)findViewById(R.id.text1);
        t2=(TextView)findViewById(R.id.text3);
        t3=(TextView)findViewById(R.id.text4);
        t4=(TextView)findViewById(R.id.text5);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("meter to convert cm,km,miles");
                value=Double.parseDouble(e1.getText().toString());
                r1=value/1000;
                String s=String.valueOf(r1);
                t2.setText(s+"km");

                r2=value*100;
                String s1=String.valueOf(r2);
                t3.setText(s1+"cm");

                r3=value*0.00062137;
                String s2=String.valueOf(r3);
                t4.setText(s2+"miles");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("kilometer to convert m,cm,miles");
                value=Double.parseDouble(e1.getText().toString());
                r1=value*1000;
                String s=String.valueOf(r1);
                t2.setText(s+"m");

                r2=value*100000;
                String s1=String.valueOf(r2);
                t3.setText(s1+"cm");

                r3=value*0.62137;
                String s2=String.valueOf(r3);
                t4.setText(s2+"miles");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("centimeter to convert m,km,miles");
                value=Double.parseDouble(e1.getText().toString());
                r1=value*0.01;
                String s=String.valueOf(r1);
                t2.setText(s+"m");

                r2=value/100000;
                String s1=String.valueOf(r2);
                t3.setText(s1+"km");

                r3=(value*6.214)/1000000;
                String s2=String.valueOf(r3);
                t4.setText(s2+"miles");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("miles to convert m,km,cm");
                value=Double.parseDouble(e1.getText().toString());
                r1=value*1609.344;
                String s=String.valueOf(r1);
                t2.setText(s+"m");

                r2=value*1.609;
                String s1=String.valueOf(r2);
                t3.setText(s1+"km");

                r3=value*160934.4;
                String s2=String.valueOf(r3);
                t4.setText(s2+"miles");
            }
        });
    }
}
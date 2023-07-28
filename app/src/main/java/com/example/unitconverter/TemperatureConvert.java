package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TemperatureConvert extends AppCompatActivity {

    TextView t1,t2,t3;
    Button b1,b2,b3;
    EditText e1;
    Double r1,r2,value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_convert);
        e1=(EditText)findViewById(R.id.edit1);
        t1=(TextView)findViewById(R.id.text1);
        t2=(TextView)findViewById(R.id.text3);
        t3=(TextView)findViewById(R.id.text4);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("celsius to convert fahrenheit,kelvin");
                value=Double.parseDouble(e1.getText().toString());
                r1=(value*9/5)+32;
                String s=String.valueOf(r1);
                t2.setText(s+"F");

                r2=value+273.15;
                String s1=String.valueOf(r2);
                t3.setText(s1+"K");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("fahrenheit to convert celsius,kelvin");
                value=Double.parseDouble(e1.getText().toString());
                r1=(value-32)*5/9;
                String s=String.valueOf(r1);
                t2.setText(s+"C");

                r2=r1+273.15;
                String s1=String.valueOf(r2);
                t3.setText(s1+"K");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("kelvin to convert celsius,fahrenheit");
                value=Double.parseDouble(e1.getText().toString());
                r2=((value-273.15)*9/5)+32;
                String s=String.valueOf(r2);
                t3.setText(s+"F");

                r1=value-273.15;
                String s1=String.valueOf(r1);
                t2.setText(s1+"C");
            }
        });
    }
}
package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        final String msg = intent.getStringExtra(FirstActivity.EXTRA);
        final String msg1 = intent.getStringExtra(FirstActivity.EXTRA1);

        final TextView textView = findViewById(R.id.editTextNumber3);
        textView.setText(msg);

        TextView textView1 = findViewById(R.id.editTextNumber4);
        textView.setText(msg1);

        btn1 = (Button) findViewById(R.id.button5);
        btn2 = (Button) findViewById(R.id.button4);
        btn3 = (Button) findViewById(R.id.button6);
        btn4 = (Button) findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number;
                number = Integer.parseInt(msg)+Integer.parseInt(msg1);

                TextView textView2 = findViewById(R.id.textView5);
                textView.setText(msg+"+"+msg1+"="+number);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number;
                number = Integer.parseInt(msg)-Integer.parseInt(msg1);

                TextView textView2 = findViewById(R.id.textView5);
                textView.setText(msg+"-"+msg1+"="+number);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number;
                number = Integer.parseInt(msg)*Integer.parseInt(msg1);

                TextView textView2 = findViewById(R.id.textView5);
                textView.setText(msg+"*"+msg1+"="+number);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number;
                number = Integer.parseInt(msg)/Integer.parseInt(msg1);

                TextView textView2 = findViewById(R.id.textView5);
                textView.setText(msg+"/"+msg1+"="+number);
            }
        });
    }
}
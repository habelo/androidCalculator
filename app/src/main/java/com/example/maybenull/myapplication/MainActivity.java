package com.example.maybenull.myapplication;

import android.media.ExifInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button subBtn = (Button) findViewById(R.id.subBtn);
        Button multBtn = (Button) findViewById(R.id.multBtn);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1 = (EditText) findViewById(R.id.firstNum);
                EditText num2 = (EditText) findViewById(R.id.secondNum);
                TextView result = (TextView) findViewById(R.id.resultTextView);

                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int res = n1+n2;

                result.setText(res+"");
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1 = (EditText) findViewById(R.id.firstNum);
                EditText num2 = (EditText) findViewById(R.id.secondNum);
                TextView result = (TextView) findViewById(R.id.resultTextView);

                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int res = n1-n2;

                result.setText(res+"");
            }
        });

        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1 = (EditText) findViewById(R.id.firstNum);
                EditText num2 = (EditText) findViewById(R.id.secondNum);
                TextView resultat = (TextView) findViewById(R.id.resultTextView);

                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int res = n1*n2;

                resultat.setText(res+"");
            }
        });
    }
}

package com.geekhub01.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstvalue, etSecondvalue;
    TextView tvAns;
    Button add, substract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etFirstvalue = findViewById(R.id.etFirstValue);
        etSecondvalue = findViewById(R.id.etSecondValue);

        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        substract = findViewById(R.id.btnSubstract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirstvalue.getText().toString());
                secondValue = Integer.parseInt(etSecondvalue.getText().toString());

                ans = firstValue  + secondValue;

                tvAns.setText("Ans is = "+ans);
            }
        });


        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirstvalue.getText().toString());
                secondValue = Integer.parseInt(etSecondvalue.getText().toString());

                ans = firstValue  - secondValue;

                tvAns.setText("Ans is = "+ans);
            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirstvalue.getText().toString());
                secondValue = Integer.parseInt(etSecondvalue.getText().toString());

                ans = firstValue  * secondValue;

                tvAns.setText("Ans is = "+ans);
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirstvalue.getText().toString());
                secondValue = Integer.parseInt(etSecondvalue.getText().toString());

                ans = firstValue  / secondValue;

                tvAns.setText("Ans is = "+ans);
            }
        });

    }
}
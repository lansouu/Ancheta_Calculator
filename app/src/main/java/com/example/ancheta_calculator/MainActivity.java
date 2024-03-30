
package com.example.ancheta_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView result;
    EditText num1;
    EditText num2;
    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.txtResult);
        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        addition = (Button) findViewById(R.id.btnAdd);
        subtraction = (Button) findViewById(R.id.btnSub);
        multiplication = (Button) findViewById(R.id.btnMultiply);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//String input1 = num1.getText().toString();
//int number = Integer.parseInt(input1);
                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double sum = myNum1 + myNum2;
                result.setText(String.valueOf(sum));
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double dif = myNum1 - myNum2;
                result.setText(String.valueOf(dif));
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//String input1 = num1.getText().toString();
//int number = Integer.parseInt(input1);
                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double sum = myNum1 * myNum2;
                result.setText(String.valueOf(sum));
            }
        });
    }

}

package com.example.italo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnC, btnEqual, btnAdict, btnSubtract, btnDivide, btnMultiple;
    TextView txtResult;
    float acumulatorCalc;
    String operacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnC = findViewById(R.id.btnC);

        btnEqual = findViewById(R.id.btnEqual);

        btnAdict = findViewById(R.id.btnAdict);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiple = findViewById(R.id.btnMultiple);

        txtResult = findViewById(R.id.txtResult);


        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResult.setText(txtResult.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResult.setText(txtResult.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResult.setText(txtResult.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResult.setText(txtResult.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResult.setText(txtResult.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResult.setText(txtResult.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResult.setText(txtResult.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResult.setText(txtResult.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResult.setText(txtResult.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResult.setText(txtResult.getText() + "9");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResult.setText("");
            }
        });

        btnAdict.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                acumulatorCalc = Float.parseFloat(txtResult.getText().toString());
                txtResult.setText("");
                operacao = "Adição";
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                acumulatorCalc = Float.parseFloat(txtResult.getText().toString());
                txtResult.setText("");
                operacao = "Subtração";
            }
        });

        btnMultiple.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                acumulatorCalc = Float.parseFloat(txtResult.getText().toString());
                txtResult.setText("");
                operacao = "Multiplicação";
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                acumulatorCalc = Float.parseFloat(txtResult.getText().toString());
                txtResult.setText("");
                operacao = "Divisão";
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operador2_string = txtResult.getText().toString();
                float operador2 = Float.parseFloat(operador2_string);
                float operador1 = acumulatorCalc;
                if(operacao == "Adição"){
                    float resultado = operador1 + operador2;
                    txtResult.setText(String.valueOf(resultado));
                }else if(operacao == "Subtração"){
                    float resultado = operador1 - operador2;
                    txtResult.setText(String.valueOf(resultado));
                }else if(operacao == "Divisão"){
                    float resultado = operador1 / operador2;
                    txtResult.setText(String.valueOf(resultado));
                }else if(operacao == "Multiplicação"){
                    float resultado = operador1 * operador2;
                    txtResult.setText(String.valueOf(resultado));
                }

            }
        });


    }
}

package com.example.italo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnProcessar;
    EditText edtNome, edtIdade, edtAltura, edtPeso;
    TextView txtNome, txtIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.pnNome);
        edtAltura = findViewById(R.id.pnAltura);
        edtPeso = findViewById(R.id.pnPeso);
        edtIdade = findViewById(R.id.pnIdade);

        txtNome = findViewById(R.id.tvNome);
        txtIMC = findViewById(R.id.tvIMC);

        btnProcessar = findViewById(R.id.btnProcessar);

        btnProcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNome.setText("Nome: " + edtNome.getText().toString());
                float altura = Float.parseFloat(edtAltura.getText().toString());
                float peso = Float.parseFloat(edtPeso.getText().toString());
                float imc = peso/(altura*altura);
                txtIMC.setText(String.valueOf(imc));
            }
        });
    }


}

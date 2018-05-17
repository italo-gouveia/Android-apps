package com.example.italo.calculomedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnProcessar;
    EditText edtName, edtAV1, edtAV2, edtAV3;
    TextView txtName, txtMedia, txtAprovado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        edtAV1 = findViewById(R.id.edtAV1);
        edtAV2 = findViewById(R.id.edtAV2);
        edtAV3 = findViewById(R.id.edtAV3);

        txtName = findViewById(R.id.txtName);
        txtMedia = findViewById(R.id.txtMedia);
        txtAprovado = findViewById(R.id.txtAprovado);

        btnProcessar = findViewById(R.id.btnProcessar);

        btnProcessar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                txtName.setText("Nome " + edtName.getText().toString());
                float av1 = Float.parseFloat(edtAV1.getText().toString());
                float av2 = Float.parseFloat(edtAV2.getText().toString());
                float av3 = Float.parseFloat(edtAV3.getText().toString());
                float media = (av1 + av2 + av3)/3;
                txtMedia.setText("A sua média final é " + media);
                if(media <= 4){
                    txtAprovado.setText("Você está reprovado!");
                }else if(media >= 6){
                    txtAprovado.setText("Você está aprovado!");
                }else{
                    txtAprovado.setText("Você está em recuperação!");
                }
            }
        });

    }
}

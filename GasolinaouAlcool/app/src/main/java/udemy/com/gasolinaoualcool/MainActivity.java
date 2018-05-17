package udemy.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnVerificar;
    private EditText edtPrecoAlcool;
    private EditText edtPrecoGasolina;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVerificar = findViewById(R.id.btn_verificar_id);
        edtPrecoAlcool = findViewById(R.id.edt_preco_alcool_id);
        edtPrecoGasolina = findViewById(R.id.edt_preco_gasolina_id);
        txtResultado = findViewById(R.id.txt_resultado_id);

        btnVerificar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String textoPrecoAlcool = edtPrecoAlcool.getText().toString();
                String textoPrecoGasolina = edtPrecoGasolina.getText().toString();

                Double floatPrecoAlcool = Double.parseDouble(textoPrecoAlcool);
                Double floatPrecoGasolina = Double.parseDouble(textoPrecoGasolina);

                Double resultado = floatPrecoAlcool / floatPrecoGasolina;
                if(resultado >= 0.7){
                    txtResultado.setText("É melhor usar a Gasolina");
                    Toast.makeText(getApplicationContext(), "Resultado calculado com sucesso", Toast.LENGTH_LONG).show();
                }else{
                    txtResultado.setText("É melhor utilizar o Alcool");
                    Toast.makeText(getApplicationContext(), "Resultado calculado com sucesso", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}

package udemy.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtIdade;
    private Button btnDescobrirIdade;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtIdade = findViewById(R.id.edt_idade_id);
        btnDescobrirIdade = findViewById(R.id.btn_descobrir_idade_id);
        txtResultado = findViewById(R.id.txt_resultado_id);

        btnDescobrirIdade.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String idadeCachorro = edtIdade.getText().toString();
                if(idadeCachorro.isEmpty()){
                    txtResultado.setText("Por favor digite um valor");
                }else{
                    int idadeCachorroInteger = Integer.parseInt(idadeCachorro);
                    int idadeHumana = idadeCachorroInteger * 7;
                    txtResultado.setText("A idade do cachorro em anos humanos é: " + idadeHumana);
                }
            }
        });

    }
}

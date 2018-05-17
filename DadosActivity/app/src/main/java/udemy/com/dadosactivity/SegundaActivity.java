package udemy.com.dadosactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    private TextView txt_novos_dados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txt_novos_dados = findViewById(R.id.txt_novos_dados_id);
        Bundle extra = getIntent().getExtras();

        if(extra!= null){
            String textoPassado = extra.getString("nome");
            txt_novos_dados.setText(textoPassado);
        }else{
            txt_novos_dados.setText("Nenhum dado foi passado!");
        }
    }
}

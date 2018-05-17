package udemy.com.empresaatmconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgEmpresa;
    private ImageView imgServicos;
    private ImageView imgClientes;
    private ImageView imgContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgEmpresa = findViewById(R.id.img_empresa_id);
        imgServicos = findViewById(R.id.img_servicos_id);
        imgClientes = findViewById(R.id.img_clientes_id);
        imgContatos = findViewById(R.id.img_contato_id);

        imgEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityEmpresa.class));
            }
        });

        imgServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityServicos.class));
            }
        });

        imgClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }
        });

        imgContatos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, ContatosActivity.class));
            }
        });
    }
}

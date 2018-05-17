package udemy.com.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imgJogar;
    private String[] opcao = {"cara", "coroa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgJogar = findViewById(R.id.img_jogar_id);

        imgJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                Random randomico = new Random();
                int numAleatorio = randomico.nextInt(2);
                //opcao[numAleatorio];
                intent.putExtra("resultado", opcao[numAleatorio]);
                startActivity(intent);
            }
        });
    }
}

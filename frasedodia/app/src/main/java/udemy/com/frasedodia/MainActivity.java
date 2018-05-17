package udemy.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtNovaFrase;
    private Button btnNovaFrase;
    private String[] frases = {
            "“Se você ouve uma voz dentro de você dizendo ‘você não pode pintar’, então pinte e essa voz será silenciada” – Vincent Van Gogh.",
            "“Uma pessoa que nunca cometeu um erro, nunca tentou nada de novo” – Albert Einstein.",
            "“Quando tudo parece estar indo contra você, lembre-se que o avião decola contra o vento, não a favor dele” – Henry Ford.",
            "“Não são os anos de sua vida que contam. É a vida em seus anos” – Abraham Lincoln.",
            "“A única maneira de fazer um excelente trabalho é amar o que você faz” – Steve Jobs.",
            "“Tudo tem beleza. Mas nem todos podem ver” – Confúcio.",
            "“A vida é como andar de bicicleta. Para ter equilíbrio, você tem que se manter em movimento” - Albert Einstein",
            "“Você perde 100% dos tiros que não dá”- Wayne Gretzky.",
            "“Definir um objetivo é o ponto de partida de toda a realização” – W. Clement Stone.",
            "“A vida é 10% do que acontece comigo e 90% de como eu reajo a isso” – Charles Swindoll.",
            "“Se você ouve uma voz dentro de você dizendo ‘você não pode pintar’, então pinte e essa voz será silenciada” – Vincent Van Gogh.",
            "“Peça, e lhes será dado; procure e encontrará; bata, e a porta será aberta para você” – Jesus.",
            "“A única pessoa que você está destinado a se tornar é a pessoa que você decide ser” – Ralph Waldo Emerson.",
            "“Muitos de nós não estamos vivendo nossos sonhos porque estamos vivendo nossos medos”- Les Brown.",
            "“Os desafios são o que tornam a vida interessante e superá-los é o que dá sentido à vida” – Joshua J. Marinho.",
            "“Limitações vivem apenas em nossas mentes. Mas se usarmos nossa imaginação, nossas possibilidades tornam-se ilimitadas” – Jamie Paolinetti."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNovaFrase = findViewById(R.id.txt_nova_frase_id);
        btnNovaFrase = findViewById(R.id.btn_nova_frase_id);

        btnNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                int numAleatorio = randomico.nextInt(frases.length);
                txtNovaFrase.setText(frases[numAleatorio]);
            }
        });
    }
}

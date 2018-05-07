package com.example.moreirao.coparssia2018;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class JogosQuatro extends AppCompatActivity {

    private ImageView bandeira1;
    private ImageView bandeira2;
    private ImageView bandeira3;
    private ImageView bandeira4;
    private ImageView bandeira5;
    private ImageView bandeira6;
    private ImageView bandeira7;
    private ImageView bandeira8;
    private TextView descricao1;
    private TextView descricao2;
    private TextView descricao3;
    private TextView descricao4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos_quatro);

        bandeira1 = (ImageView) findViewById(R.id.b_bandeira1);
        bandeira2 = (ImageView) findViewById(R.id.b_bandeira2);
        bandeira3 = (ImageView) findViewById(R.id.b_bandeira3);
        bandeira4 = (ImageView) findViewById(R.id.b_bandeira4);
        bandeira5 = (ImageView) findViewById(R.id.b_bandeira5);
        bandeira6 = (ImageView) findViewById(R.id.b_bandeira6);
        bandeira7 = (ImageView) findViewById(R.id.b_bandeira7);
        bandeira8 = (ImageView) findViewById(R.id.b_bandeira8);
        descricao1 = (TextView) findViewById(R.id.b_descricao1);
        descricao2 = (TextView) findViewById(R.id.b_descricao2);
        descricao3 = (TextView) findViewById(R.id.b_descricao3);
        descricao4 = (TextView) findViewById(R.id.b_descricao4);

        Bundle extra = getIntent().getExtras();

        if(extra != null) {
            int jogoselecionado = extra.getInt("jogo");

            if (jogoselecionado == 3) {
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.franca));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.australia));
                String texto = getString(R.string.jogo_167h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.argentina));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.islandia));
                String texto1 = getString(R.string.jogo_1610h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.peru));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dinamarca));
                String texto2 = getString(R.string.jogo_1613h);
                descricao3.setText(texto2);

                bandeira7.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.croacia));
                bandeira8.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.nigeria));
                String texto3 = getString(R.string.jogo_1616h);
                descricao4.setText(texto3);
            } else if (jogoselecionado == 1) {
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.arabiasaudita));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.egito));
                String texto = getString(R.string.jogo_25111h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.uruguai));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.russia));
                String texto1 = getString(R.string.jogo_25112h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ira));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.portugal));
                String texto2 = getString(R.string.jogo_25151h);
                descricao3.setText(texto2);

                bandeira7.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.espanha));
                bandeira8.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.marrocos));
                String texto3 = getString(R.string.jogo_25152h);
                descricao4.setText(texto3);
            } else if (jogoselecionado == 2) {
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.australia));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.peru));
                String texto = getString(R.string.jogo_26111h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dinamarca));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.franca));
                String texto1 = getString(R.string.jogo_26112h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.nigeria));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.argentina));
                String texto2 = getString(R.string.jogo_26151h);
                descricao3.setText(texto2);

                bandeira7.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.islandia));
                bandeira8.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.croacia));
                String texto3 = getString(R.string.jogo_26152h);
                descricao4.setText(texto3);
            } else if (jogoselecionado == 3) {
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.coreiadosul));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.alemanha));
                String texto = getString(R.string.jogo_27111h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.mexico));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.suecia));
                String texto1 = getString(R.string.jogo_27112h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.suica));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.costarica));
                String texto2 = getString(R.string.jogo_27151h);
                descricao3.setText(texto2);

                bandeira7.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.servia));
                bandeira8.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.brasil));
                String texto3 = getString(R.string.jogo_27152h);
                descricao4.setText(texto3);
            }else if (jogoselecionado == 4){
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.senegal));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.colombia));
                String texto = getString(R.string.jogo_28111h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.japao));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.polonia));
                String texto1 = getString(R.string.jogo_28112h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.inglaterra));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.belgica));
                String texto2 = getString(R.string.jogo_28151h);
                descricao3.setText(texto2);

                bandeira7.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.panama));
                bandeira8.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.tunisia));
                String texto3 = getString(R.string.jogo_28152h);
                descricao4.setText(texto3);
            }
        }
    }
}

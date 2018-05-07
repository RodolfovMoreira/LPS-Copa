package com.example.moreirao.coparssia2018;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class JogosTres extends AppCompatActivity {

    private ImageView bandeira1;
    private ImageView bandeira2;
    private ImageView bandeira3;
    private ImageView bandeira4;
    private ImageView bandeira5;
    private ImageView bandeira6;
    private TextView descricao1;
    private TextView descricao2;
    private TextView descricao3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos_tres);

        bandeira1 = (ImageView) findViewById(R.id.b_bandeira1);
        bandeira2 = (ImageView) findViewById(R.id.bandeira2);
        bandeira3 = (ImageView) findViewById(R.id.b_bandeira3);
        bandeira4 = (ImageView) findViewById(R.id.bandeira4);
        bandeira5 = (ImageView) findViewById(R.id.b_bandeira5);
        bandeira6 = (ImageView) findViewById(R.id.bandeira6);
        descricao1 = (TextView) findViewById(R.id.descricao1);
        descricao2 = (TextView) findViewById(R.id.descricao2);
        descricao3 = (TextView) findViewById(R.id.descricao3);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            int jogoselecionado = extra.getInt("jogo");

            if(jogoselecionado == 1){
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.russia));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.arabiasaudita));
                String texto = getString(R.string.jogo_1412h);
                descricao1.setText(texto);
                String texto2 = "Jogo de Abertura";
                descricao2.setText(texto2);
                descricao3.setText(texto2);
            }else if(jogoselecionado == 2){
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.egito));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.uruguai));
                String texto = getString(R.string.jogo_159h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.marrocos));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.ira));
                String texto1 = getString(R.string.jogo_1512h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.portugal));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.espanha));
                String texto2 = getString(R.string.jogo_1515h);
                descricao3.setText(texto2);
            }else if(jogoselecionado == 4){
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.costarica));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.servia));
                String texto = getString(R.string.jogo_179h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.alemanha));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.mexico));
                String texto1 = getString(R.string.jogo_1712h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.brasil));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.suica));
                String texto2 = getString(R.string.jogo_1715h);
                descricao3.setText(texto2);
            }else if(jogoselecionado == 5){
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.suecia));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.coreiadosul));
                String texto = getString(R.string.jogo_189h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.belgica));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.panama));
                String texto1 = getString(R.string.jogo_1812h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.tunisia));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.inglaterra));
                String texto2 = getString(R.string.jogo_1815h);
                descricao3.setText(texto2);
            }else if(jogoselecionado == 6){
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.colombia));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.japao));
                String texto = getString(R.string.jogo_199h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.polonia));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.senegal));
                String texto1 = getString(R.string.jogo_1912h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.russia));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.egito));
                String texto2 = getString(R.string.jogo_1915h);
                descricao3.setText(texto2);
            }else if(jogoselecionado == 7){
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.portugal));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.marrocos));
                String texto = getString(R.string.jogo_209h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.uruguai));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.arabiasaudita));
                String texto1 = getString(R.string.jogo_2012h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.ira));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.espanha));
                String texto2 = getString(R.string.jogo_2015h);
                descricao3.setText(texto2);

            }else if(jogoselecionado == 8){
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.dinamarca));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.australia));
                String texto = getString(R.string.jogo_219h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.franca));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.peru));
                String texto1 = getString(R.string.jogo_2112h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.argentina));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.croacia));
                String texto2 = getString(R.string.jogo_2115h);
                descricao3.setText(texto2);

            }else if(jogoselecionado == 9){
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.brasil));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.costarica));
                String texto = getString(R.string.jogo_229h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.nigeria));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.islandia));
                String texto1 = getString(R.string.jogo_2212h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.servia));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.suica));
                String texto2 = getString(R.string.jogo_2215h);
                descricao3.setText(texto2);

            }else if(jogoselecionado == 10){
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.belgica));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.tunisia));
                String texto = getString(R.string.jogo_239h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.coreiadosul));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.mexico));
                String texto1 = getString(R.string.jogo_2312h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.alemanha));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.suecia));
                String texto2 = getString(R.string.jogo_2315h);
                descricao3.setText(texto2);

            }else if(jogoselecionado == 11){
                bandeira1.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.inglaterra));
                bandeira2.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.panama));
                String texto = getString(R.string.jogo_249h);
                descricao1.setText(texto);

                bandeira3.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.japao));
                bandeira4.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.senegal));
                String texto1 = getString(R.string.jogo_2412h);
                descricao2.setText(texto1);

                bandeira5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.polonia));
                bandeira6.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.colombia));
                String texto2 = getString(R.string.jogo_2415h);
                descricao3.setText(texto2);

            }
        }


    }
}

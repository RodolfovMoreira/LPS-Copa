package com.example.moreirao.coparssia2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ListaPartidas extends AppCompatActivity implements View.OnClickListener{

    private ImageView b_14;
    private ImageView b_15;
    private ImageView b_16;
    private ImageView b_17;
    private ImageView b_18;
    private ImageView b_19;
    private ImageView b_20;
    private ImageView b_21;
    private ImageView b_22;
    private ImageView b_23;
    private ImageView b_24;
    private ImageView b_25;
    private ImageView b_26;
    private ImageView b_27;
    private ImageView b_28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_partidas);

        b_14 = (ImageView) findViewById(R.id.b_14);
        b_15 = (ImageView) findViewById(R.id.b_15);
        b_16 = (ImageView) findViewById(R.id.b_16);
        b_17 = (ImageView) findViewById(R.id.b_17);
        b_18 = (ImageView) findViewById(R.id.b_18);
        b_19 = (ImageView) findViewById(R.id.b_19);
        b_20 = (ImageView) findViewById(R.id.b_20);
        b_21 = (ImageView) findViewById(R.id.b_21);
        b_22 = (ImageView) findViewById(R.id.b_22);
        b_23 = (ImageView) findViewById(R.id.b_23);
        b_24 = (ImageView) findViewById(R.id.b_24);
        b_25 = (ImageView) findViewById(R.id.b_25);
        b_26 = (ImageView) findViewById(R.id.b_26);
        b_27 = (ImageView) findViewById(R.id.b_27);
        b_28 = (ImageView) findViewById(R.id.b_28);


        b_14.setOnClickListener(this);
        b_15.setOnClickListener(this);
        b_16.setOnClickListener(this);
        b_17.setOnClickListener(this);
        b_18.setOnClickListener(this);
        b_19.setOnClickListener(this);
        b_20.setOnClickListener(this);
        b_21.setOnClickListener(this);
        b_22.setOnClickListener(this);
        b_23.setOnClickListener(this);
        b_24.setOnClickListener(this);
        b_25.setOnClickListener(this);
        b_26.setOnClickListener(this);
        b_27.setOnClickListener(this);
        b_28.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(ListaPartidas.this,JogosTres.class);
        Intent intent2 = new Intent(ListaPartidas.this,JogosQuatro.class);

        switch (v.getId()){
            case R.id.b_14: // 1 jogo
                intent.putExtra("jogo", 1); // DONE
                startActivity(intent);
                break;
            case R.id.b_15:
                intent.putExtra("jogo", 2); // DONE
                startActivity(intent);
                break;
            case R.id.b_16:
                intent2.putExtra("jogo", 3); //4 jogos DONE
                startActivity(intent2);
                break;
            case R.id.b_17:
                intent.putExtra("jogo", 4); // DONE
                startActivity(intent);
                break;
            case R.id.b_18:
                intent.putExtra("jogo", 5); // DONE
                startActivity(intent);
                break;
            case R.id.b_19:
                intent.putExtra("jogo", 6); // DONE
                startActivity(intent);
                break;
            case R.id.b_20:
                intent.putExtra("jogo", 7); // DONE
                startActivity(intent);
                break;
            case R.id.b_21:
                intent.putExtra("jogo", 8); // DONE
                startActivity(intent);
                break;
            case R.id.b_22:
                intent.putExtra("jogo", 9); // DONE
                startActivity(intent);
                break;
            case R.id.b_23:
                intent.putExtra("jogo", 10); // DONE
                startActivity(intent);
                break;
            case R.id.b_24:
                intent.putExtra("jogo", 11); // DONE
                startActivity(intent);
                break;
            case R.id.b_25: // 4 jogos
                intent2.putExtra("jogo", 1); //4 jogos DONE
                startActivity(intent2);
                break;
            case R.id.b_26: // 4 jogos
                intent2.putExtra("jogo", 2); //4 jogos DONE
                startActivity(intent2);
                break;
            case R.id.b_27: // 4 jogos
                intent2.putExtra("jogo", 3); //4 jogos DONE
                startActivity(intent2);
                break;
            case R.id.b_28: // 4 jogos
                intent2.putExtra("jogo", 4); //4 jogos
                startActivity(intent2);
                break;
        }
    }
}

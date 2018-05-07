package com.example.moreirao.coparssia2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoListadepartidas;
    private ImageView botaoCuriosidades;
    private ImageView botaoPaisesparticipantes;
    private ImageView botaoCalendario;
    private ImageView botaoAudios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoListadepartidas = (ImageView) findViewById(R.id.b_listapartidas);
        botaoCuriosidades = (ImageView) findViewById(R.id.b_curiosidades);
        botaoPaisesparticipantes = (ImageView) findViewById(R.id.b_paisesparticipantes);
        botaoCalendario = (ImageView) findViewById(R.id.b_calendario);
        botaoAudios = (ImageView) findViewById(R.id.b_audios);

        botaoListadepartidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaPartidas.class);
                startActivity(intent);
            }
        });

        botaoCuriosidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Curiosidades.class );
                startActivity(intent);
            }
        });

        botaoPaisesparticipantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PaisesParticipantes.class);
                startActivity(intent);
            }
        });

        botaoCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calendario.class);
                startActivity(intent);
            }
        });

        botaoAudios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Audios.class);
                startActivity(intent);
            }
        });
    }
}

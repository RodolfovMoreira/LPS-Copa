package com.example.moreirao.coparssia2018;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Audios extends AppCompatActivity implements View.OnClickListener {

    private ImageView brazil;
    private ImageView cruzamento;
    private ImageView goldaalemanha;
    private ImageView hajacoracao;
    private ImageView vuvuzela;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audios);

        brazil = (ImageView) findViewById(R.id.b_aquarela);
        cruzamento = (ImageView) findViewById(R.id.b_cruzamento);
        goldaalemanha = (ImageView) findViewById(R.id.b_goldaalemanha);
        hajacoracao = (ImageView) findViewById(R.id.b_hajacoracao);
        vuvuzela = (ImageView) findViewById(R.id.b_vuvuzela);

        brazil.setOnClickListener(this);
        cruzamento.setOnClickListener(this);
        goldaalemanha.setOnClickListener(this);
        hajacoracao.setOnClickListener(this);
        vuvuzela.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.b_aquarela:
                destocarSom();
                mediaPlayer = MediaPlayer.create(Audios.this, R.raw.brazilconnif);
                tocarSom();
                break;
            case R.id.b_cruzamento:
                destocarSom();
                mediaPlayer = MediaPlayer.create(Audios.this, R.raw.cruzamento);
                tocarSom();
                break;
            case R.id.b_goldaalemanha:
                destocarSom();
                mediaPlayer = MediaPlayer.create(Audios.this, R.raw.goldalemanha);
                tocarSom();
                break;
            case R.id.b_hajacoracao:
                destocarSom();
                mediaPlayer = MediaPlayer.create(Audios.this, R.raw.hajacoracao);
                tocarSom();
                break;
            case R.id.b_vuvuzela:
                destocarSom();
                mediaPlayer = MediaPlayer.create(Audios.this, R.raw.vuvuzela);
                tocarSom();
                break;
        }
    }
    public void destocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
    public void tocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.start();
        }
    }
}

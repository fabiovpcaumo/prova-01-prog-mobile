package br.com.portalw.avaliacao01;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Exercicio08 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio08);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.abertura);
        mediaPlayer.start();
    }
}

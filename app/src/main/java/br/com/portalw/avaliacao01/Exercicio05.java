package br.com.portalw.avaliacao01;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Exercicio05 extends AppCompatActivity {
    public static final String SOBRE_MESSAGE = "br.com.portalw.avaliacao01.SOBREAPP";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio05);
        
    }

    public void gotoSobre(View view){
        Intent intent = new Intent(this, SobreSistema.class);
        startActivity(intent);
    }

}

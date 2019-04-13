package br.com.portalw.avaliacao01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Exercicio07 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio07);
    }

    public void gotoDadosFrete(View view){
        Intent intent = new Intent(this, DadosFrete.class);
        startActivityForResult(intent, 1);
    }
}

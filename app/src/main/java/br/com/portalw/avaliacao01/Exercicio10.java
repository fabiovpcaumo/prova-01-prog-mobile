package br.com.portalw.avaliacao01;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Exercicio10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio10);

        SharedPreferences preferences = getSharedPreferences("frete", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("email", "fabiovpcaumo@gmail.com");
        editor.putFloat("peso", 83.4f);
        editor.commit();


    }
}

package br.com.portalw.avaliacao01;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Exercicio09 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio09);

        SharedPreferences preferences = getSharedPreferences("frete", MODE_PRIVATE);
        preferences.getString("email", null);
        preferences.getFloat("peso", 0);
    }
}

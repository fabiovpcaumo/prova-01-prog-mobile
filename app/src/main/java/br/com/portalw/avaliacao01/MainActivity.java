package br.com.portalw.avaliacao01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtPeso;
    Button btnGetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPeso = findViewById(R.id.edtPeso);
        btnGetText = findViewById(R.id.btnPeso);
        btnGetText.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        float valPeso = Float.parseFloat(edtPeso.getText().toString());
                        System.out.println(valPeso);

                    }
                }
        );
    }
}

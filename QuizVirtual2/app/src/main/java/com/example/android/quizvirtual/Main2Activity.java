package com.example.android.quizvirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void incorrecta1(View view){
        RadioButton filippo = (RadioButton) findViewById(R.id.filippo_juvara);
        boolean filippoSi = filippo.isChecked();

        RadioButton giovanni = (RadioButton) findViewById(R.id.giovanni_battista_sacchetti);
        boolean giovanniSi = giovanni.isChecked();

        RadioButton antoine = (RadioButton) findViewById(R.id.antoine_dumanche);
        boolean antoineSi = antoine.isChecked();

        if(filippoSi == true || giovanniSi == true || antoineSi == true){
            Toast.makeText(this, "Respuesta incorrecta.", Toast.LENGTH_SHORT).show();
        }

        filippo.setChecked(false);
        giovanni.setChecked(false);
        antoine.setChecked(false);
    }

    public void respuesta1(View view){
        RadioButton albertoC = (RadioButton) findViewById(R.id.alberto_churriguera);
        boolean albertoSi = albertoC.isChecked();

        if(albertoSi == true){
            Toast.makeText(this, "Respuesta correcta!.\nClic en la respuesta para ir al inicio.", Toast.LENGTH_SHORT).show();
        }

        albertoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volver = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(volver);
            }
        });
    }
}

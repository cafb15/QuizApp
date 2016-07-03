package com.example.android.quizvirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void incorrecta2(View view){
        Toast.makeText(this, "Respuesta incorrecta.", Toast.LENGTH_SHORT).show();
        RadioButton teruel = (RadioButton) findViewById(R.id.teruel);
        boolean teruelSi = teruel.isChecked();

        RadioButton pamplona = (RadioButton) findViewById(R.id.pamplona);
        boolean pamplonaSi = pamplona.isChecked();

        RadioButton huesca = (RadioButton) findViewById(R.id.huesca);
        boolean huescaSi = huesca.isChecked();

        if(teruelSi == true || pamplonaSi == true || huescaSi == true){
            Toast.makeText(this, "Respuesta incorrecta.", Toast.LENGTH_SHORT).show();
        }

        teruel.setChecked(false);
        pamplona.setChecked(false);
        huesca.setChecked(false);
    }

    public void respuesta2(View view){
        RadioButton zaragoza = (RadioButton) findViewById(R.id.zaragoza);
        boolean zaragozaSi = zaragoza.isChecked();

        if(zaragozaSi == true){
            Toast.makeText(this, "Respuesta correcta!.\nClic en la respuesta para ir al inicio.", Toast.LENGTH_SHORT).show();
        }

        zaragoza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(regresar);
            }
        });
    }
}

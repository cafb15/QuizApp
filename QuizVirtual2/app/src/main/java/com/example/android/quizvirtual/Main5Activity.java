package com.example.android.quizvirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void incorrecta4(View view){
        RadioButton chicago = (RadioButton) findViewById(R.id.chicago);
        boolean chicagoSi = chicago.isChecked();

        RadioButton washington = (RadioButton) findViewById(R.id.washington);
        boolean washingtonSi = washington.isChecked();

        RadioButton philadelphia = (RadioButton) findViewById(R.id.philadelphia);
        boolean philadelphiaSi = philadelphia.isChecked();

        if(chicagoSi == true || washingtonSi == true || philadelphiaSi == true){
            Toast.makeText(this, "Respuesta incorrecta.", Toast.LENGTH_SHORT).show();
        }

        chicago.setChecked(false);
        washington.setChecked(false);
        philadelphia.setChecked(false);
    }

    public void respuesta3(View view){
        RadioButton newYork = (RadioButton) findViewById(R.id.new_york);
        boolean newYorkSi = newYork.isChecked();

        if(newYorkSi == true){
            Toast.makeText(this, "Respuesta correcta!.\nClic en la respuesta para ir al inicio.", Toast.LENGTH_SHORT).show();
        }

        newYork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retornar = new Intent(Main5Activity.this, MainActivity.class);
                startActivity(retornar);
            }
        });
    }
}

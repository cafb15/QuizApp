package com.example.android.quizvirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void incorrecta3(View view){
        RadioButton higado = (RadioButton) findViewById(R.id.el_higado);
        boolean higadoSi = higado.isChecked();

        RadioButton riñones = (RadioButton) findViewById(R.id.los_riñones);
        boolean riñonesSi = riñones.isChecked();

        RadioButton corazon = (RadioButton) findViewById(R.id.el_corazon);
        boolean corazonSi = corazon.isChecked();

        if(higadoSi == true || riñonesSi == true || corazonSi == true){
            Toast.makeText(this, "Respuesta incorrecta.", Toast.LENGTH_SHORT).show();
        }

        higado.setChecked(false);
        riñones.setChecked(false);
        corazon.setChecked(false);
    }

    public void respuesta4(View view){
        RadioButton losPulmones = (RadioButton) findViewById(R.id.los_pulmones);
        boolean pulmonesSi = losPulmones.isChecked();

        if(pulmonesSi == true){
            Toast.makeText(this, "Respuesta correcta!.\nClic en la respuesta para ir al inicio.", Toast.LENGTH_SHORT).show();
        }

        losPulmones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(regresar);
            }
        });
    }
}

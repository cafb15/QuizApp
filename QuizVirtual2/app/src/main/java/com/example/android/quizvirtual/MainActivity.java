package com.example.android.quizvirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button arte = (Button) findViewById(R.id.arte_button);
        arte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(in);
            }
        });

        Button geografia = (Button) findViewById(R.id.geo_button);
        geografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geo = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(geo);
            }
        });

        Button ciencia = (Button) findViewById(R.id.ciencia_button);
        ciencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cien = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(cien);
            }
        });

        Button historia = (Button) findViewById(R.id.historia_button);
        historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent his = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(his);
            }
        });
    }
}

package com.example.marcos.tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ConsultarCarros extends AppCompatActivity {
    ImageButton btGrupoA,btGrupoB,btGrupoC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_carros);
        btGrupoA = (ImageButton)findViewById(R.id.btGrupoC2);
        btGrupoB = (ImageButton)findViewById(R.id.btGrupoF2);
        btGrupoC = (ImageButton)findViewById(R.id.btGrupom2);

        btGrupoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ConsultarCarros.this, grupoC.class);
                startActivity(i);

            }
        });

        btGrupoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ConsultarCarros.this, grupoF.class);
                startActivity(i);

            }
        });

        btGrupoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ConsultarCarros.this, grupoM.class);
                startActivity(i);

            }
        });
    }
}

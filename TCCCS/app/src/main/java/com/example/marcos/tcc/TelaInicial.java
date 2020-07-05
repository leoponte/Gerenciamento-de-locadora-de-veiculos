package com.example.marcos.tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity {

    Button btRegistra,btReservas,btVeiculos,btSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        btRegistra = (Button)findViewById(R.id.buttonReservar);
        btReservas = (Button)findViewById(R.id.buttonConsultar);
        btVeiculos = (Button)findViewById(R.id.buttonConsultarVeiculos);
        btSobre = (Button)findViewById(R.id.buttonSobre);

        btRegistra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TelaInicial.this, TelaReserva.class);
                startActivity(i);
            }
        });

        btReservas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreReservas = new Intent(TelaInicial.this, TelaMinhasReservas.class);
                startActivity(abreReservas);
            }
        });

        btVeiculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreVeiculos = new Intent(TelaInicial.this, ConsultarCarros.class);
                startActivity(abreVeiculos);
            }
        });

        btSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sobre = new Intent(TelaInicial.this, TelaSobre.class);
                startActivity(sobre);
            }
        });


    }
}

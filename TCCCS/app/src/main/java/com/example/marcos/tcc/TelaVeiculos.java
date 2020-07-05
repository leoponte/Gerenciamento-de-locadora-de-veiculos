package com.example.marcos.tcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TelaVeiculos extends AppCompatActivity {
    ImageButton btgrupoc,btgrupof,btgrupom;
    TextView    txtgrupoc,txtgrupof,txtgrupom,txtunosimiliar,txtkasimiliar,txtcorollasimilia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_veiculos);

        btgrupoc = (ImageButton)findViewById(R.id.btGrupoC);
        btgrupof = (ImageButton)findViewById(R.id.btGrupoF);
        btgrupom = (ImageButton)findViewById(R.id.btGrupoM);
        txtgrupoc = (TextView)findViewById(R.id.txtGrupoC);
        txtgrupof = (TextView)findViewById(R.id.txtGrupoF);
        txtgrupom = (TextView)findViewById(R.id.txtGrupoM);
        txtunosimiliar = (TextView)findViewById(R.id.txtUnoSimiliar);
        txtkasimiliar = (TextView)findViewById(R.id.txtKaSimilia);
        txtcorollasimilia = (TextView)findViewById(R.id.txtCorollaSimiliar);

        btgrupoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreCadastro = new Intent(TelaVeiculos.this, TelaCadastroLocacao.class);
                startActivity(abreCadastro);
            }
        });

        btgrupof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreCadastro1 = new Intent(TelaVeiculos.this, TelaCadastroLocacao.class);
                startActivity(abreCadastro1);
            }
        });

        btgrupom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreCadastro2 = new Intent(TelaVeiculos.this, TelaCadastroLocacao.class);
                startActivity(abreCadastro2);
            }
        });

    }
}

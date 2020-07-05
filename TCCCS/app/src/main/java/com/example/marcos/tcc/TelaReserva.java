package com.example.marcos.tcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TelaReserva extends AppCompatActivity {
    Spinner localretirada, localDevolucao, sretirada, sdevolucao;
    TextView LocaldeRetirada, LocaldeDevolução, Retirada, Devolucao;
    EditText DataRetirada, DataDevolucao;
    Button btavancar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_reserva);

        sdevolucao = (Spinner) findViewById(R.id.spinnerDevolucao);
        localretirada = (Spinner) findViewById(R.id.spinnerLocalRetirada);
        sretirada = (Spinner) findViewById(R.id.spinnerRetirada);
        localDevolucao = (Spinner) findViewById(R.id.spinnerlocalDevolucao);
        LocaldeRetirada = (TextView) findViewById(R.id.textView);
        LocaldeDevolução = (TextView) findViewById(R.id.textView2);
        Retirada = (TextView) findViewById(R.id.TextView3);
        Devolucao = (TextView) findViewById(R.id.textView5);
        DataRetirada = (EditText) findViewById(R.id.editTextDataRetirada);
        btavancar = (Button) findViewById(R.id.buttonAvancar);
        DataDevolucao = (EditText) findViewById(R.id.editTextDataDevolucao);


        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Local_de_Retirada, android.R.layout.simple_spinner_item);
        localretirada.setAdapter(adapter);

        AdapterView.OnItemSelectedListener escolha = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = localretirada.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
        localretirada.setOnItemSelectedListener(escolha);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.Local_de_Devolucao, android.R.layout.simple_spinner_item);
        localDevolucao.setAdapter(adapter1);

        AdapterView.OnItemSelectedListener escolha1 = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item1 = localDevolucao.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
        localDevolucao.setOnItemSelectedListener(escolha1);

        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.Retirada, android.R.layout.simple_spinner_item);
        sretirada.setAdapter(adapter2);

        AdapterView.OnItemSelectedListener escolha2 = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item2 = sretirada.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
        sretirada.setOnItemSelectedListener(escolha2);

        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this, R.array.Devolucao, android.R.layout.simple_spinner_item);
        sdevolucao.setAdapter(adapter3);

        AdapterView.OnItemSelectedListener escolha3 = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item2 = sdevolucao.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
        sdevolucao.setOnItemSelectedListener(escolha3);

        btavancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TelaReserva.this, TelaVeiculos.class);
                startActivity(i);
            }
        });


    }
}

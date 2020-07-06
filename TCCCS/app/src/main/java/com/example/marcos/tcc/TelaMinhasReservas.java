package com.example.marcos.tcc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class TelaMinhasReservas extends AppCompatActivity {
    ListView listarReservas;
    EditText editCPF;
    Button btbuscar;

    BancoDados db = new BancoDados(this);

    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;
    public static String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_minhas_reservas);
        listarReservas = (ListView) findViewById(R.id.listReservas);
        btbuscar = (Button) findViewById(R.id.buttonBuscar);
        editCPF = (EditText)findViewById(R.id.editTextCpf);


        //listarClientes();

        btbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = editCPF.getText().toString();
                listarClientes();
            }
        });
    }


    public void listarClientes() {

        ArrayList<Cliente> clientes = db.listaTodosClientes(a);


        adapter = new ArrayAdapter(TelaMinhasReservas.this, android.R.layout.simple_list_item_1, clientes);

        listarReservas.setAdapter(adapter);


    }
}

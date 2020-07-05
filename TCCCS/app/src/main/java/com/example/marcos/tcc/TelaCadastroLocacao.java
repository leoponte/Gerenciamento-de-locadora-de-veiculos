package com.example.marcos.tcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaCadastroLocacao extends AppCompatActivity {
    EditText EDNome,EDCPF,EDEMAIL,EDTEL,EDRG;
    Button   BTNReservar;

    BancoDados db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_locacao);
        EDNome = (EditText)findViewById(R.id.edNome);
        EDCPF = (EditText)findViewById(R.id.edCpf);
        EDEMAIL = (EditText)findViewById(R.id.edEmail);
        EDTEL = (EditText)findViewById(R.id.edTel);
        EDRG = (EditText)findViewById(R.id.edRg);
        BTNReservar = (Button)findViewById(R.id.btnReservar);

        final BancoDados db = new BancoDados(this);

        BTNReservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = EDNome.getText().toString();
                String cpf = EDCPF.getText().toString();
                String email = EDEMAIL.getText().toString();
                String telefone = EDTEL.getText().toString();
                String rg = EDRG.getText().toString();

                if (nome.equals("")){
                    Toast.makeText(TelaCadastroLocacao.this,"Nome não inserido tente novamente", Toast.LENGTH_LONG).show();
                }else if (cpf.equals("")){
                    Toast.makeText(TelaCadastroLocacao.this,"CPF não inserido tente novamente", Toast.LENGTH_LONG).show();
                }else if (email.equals("")){
                    Toast.makeText(TelaCadastroLocacao.this,"Email não inserido tente novamente", Toast.LENGTH_LONG).show();
                }else if (telefone.equals("")){
                    Toast.makeText(TelaCadastroLocacao.this,"Telefone não inserido tente novamente", Toast.LENGTH_LONG).show();
                }else if (rg.equals("")){
                    Toast.makeText(TelaCadastroLocacao.this,"RG não inserido tente novamente", Toast.LENGTH_LONG).show();
                }else{

                    //tudo ok

                    Cliente pinto = new Cliente();

                    pinto.nome = nome;
                    pinto.cpf = cpf;
                    pinto.email = email;
                    pinto.telefone = telefone;
                    pinto.rg = rg;

                    long res = db.addCliente(pinto);

                    if (res > 0){
                        Intent i = new Intent(TelaCadastroLocacao.this, TelaInicial.class);
                        startActivity(i);
                        finish();
                        Toast.makeText(TelaCadastroLocacao.this, "Registro Efetuado com Sucesso", Toast.LENGTH_LONG).show();

                    }

                }
            }

            });
        }

}

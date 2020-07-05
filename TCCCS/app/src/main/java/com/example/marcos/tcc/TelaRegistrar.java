package com.example.marcos.tcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class TelaRegistrar extends AppCompatActivity {

    EditText EtUsername,EtRgSenha,EtConfirmaSenha;
    Button   buttonRegistra;

    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_registrar);

        db = new DBHelper(this);




        EtUsername = (EditText)findViewById(R.id.EtUsername);
        EtRgSenha = (EditText)findViewById(R.id.Editsenha);
        EtConfirmaSenha = (EditText)findViewById(R.id.EditsenhaC);

        buttonRegistra = (Button)findViewById(R.id.buttonRegistra);

        buttonRegistra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = EtUsername.getText().toString();
                String p1 = EtRgSenha.getText().toString();
                String p2 = EtConfirmaSenha.getText().toString();

                if(username.equals("")){
                    Toast.makeText(TelaRegistrar.this,"Usuário não inserido, tenta novamente", Toast.LENGTH_LONG).show();
                }
                else if(p1.equals("") || p2.equals("")){
                    Toast.makeText(TelaRegistrar.this,"Deve preencher a senha corretamente, tente novamente", Toast.LENGTH_LONG).show();
                }
                else if (!p1.equals(p2)) {
                    Toast.makeText(TelaRegistrar.this, "Senhas não correspondem, tente novamente", Toast.LENGTH_LONG).show();
                }else{
                    //tudo ok
                long res = db.CriarUtilizador(username, p1);
                if (res>0){
                    Intent volta = new Intent(TelaRegistrar.this,TelaLogin.class);
                    startActivity(volta);
                    Toast.makeText(TelaRegistrar.this, "Registro Efetuado com Sucesso", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(TelaRegistrar.this, "Registro inválido, tenta novamente", Toast.LENGTH_LONG).show();
                }

                }


            }
        });
    }
}

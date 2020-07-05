package com.example.marcos.tcc;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {

    Button buttonLogin;
    TextView textRegistrar;
    EditText editTextLogin, editTextSenha;

    DBHelper db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        textRegistrar = (TextView) findViewById(R.id.textRegistrar);
        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextSenha = (EditText) findViewById(R.id.editTextSenha);

        db = new DBHelper(this);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextLogin.getText().toString();
                String password = editTextSenha.getText().toString();

                if (username.equals("")){
                    Toast.makeText(TelaLogin.this,"Usuário não inserido, tenta novamente", Toast.LENGTH_LONG).show();
                }else if (password.equals("")){
                    Toast.makeText(TelaLogin.this,"Senha não inserida, tenta novamente", Toast.LENGTH_LONG).show();
                }else {
                    //tudo ok
                    String res = db.ValidarLogin(username, password);

                    if (res.equals("OK")){
                        Intent i = new Intent(TelaLogin.this, TelaInicial.class);
                        startActivity(i);
                        finish();

                    }else{
                        Toast.makeText(TelaLogin.this,"Login inválido tente novamente", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

        textRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TelaLogin.this, TelaRegistrar.class);
                startActivity(i);

            }
        });





    }


}

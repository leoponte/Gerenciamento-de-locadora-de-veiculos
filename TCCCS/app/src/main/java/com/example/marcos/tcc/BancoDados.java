package com.example.marcos.tcc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Marcos on 21/11/2017.
 */

public class BancoDados extends SQLiteOpenHelper {

    private static final int VERSAO_BANCO = 1;
    private static final String BANCO_CLIENTE = "bd_cliente2";

    private static final String TABELA_CLIENTE = "tb_cliente";

    private static final String COLUNA_CODIGO = "codigo";
    private static final String COLUNA_NOME = "nome";
    private static final String COLUNA_CPF = "cpf";
    private static final String COLUNA_EMAIL = "email";
    private static final String COLUNA_TELEFONE = "telefone";
    private static final String COLUNA_RG = "rg";




    public BancoDados(Context context) {
        super(context, BANCO_CLIENTE, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    String QUERY_COLUNA = "CREATE TABLE " + TABELA_CLIENTE + "("
            + COLUNA_CODIGO + " INTEGER PRIMARY KEY, " +
              COLUNA_NOME + " TEXT, "
            + COLUNA_CPF + " TEXT, " +
              COLUNA_EMAIL + " TEXT, "
            + COLUNA_TELEFONE + " TEXT, " +
             COLUNA_RG + " TEXT)";

        db.execSQL(QUERY_COLUNA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {


    }

    /* CRUD ABAIXO */

  public long addCliente(Cliente cliente){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COLUNA_NOME, cliente.getNome());
        values.put(COLUNA_CPF, cliente.getCpf());
        values.put(COLUNA_EMAIL, cliente.getEmail());
        values.put(COLUNA_TELEFONE, cliente.getTelefone());
        values.put(COLUNA_RG, cliente.getRg());

         long jegue = db.insert(TABELA_CLIENTE, null, values);

         db.close();
      return jegue;

    }

    public ArrayList<Cliente> listaTodosClientes(String clausula){
        ArrayList<Cliente> listaclientes = new ArrayList<Cliente>();

        String query = "SELECT * FROM " + TABELA_CLIENTE + " WHERE cpf='" + clausula + "'";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery(query, null);

        while (c.moveToNext()){

                Cliente cliente = new Cliente();
                cliente.setCodigo(Integer.parseInt(c.getString(0)));
                cliente.setNome(c.getString(1));
                cliente.setCpf(c.getString(2));
                cliente.setEmail(c.getString(3));
                cliente.setTelefone(c.getString(4));
                cliente.setRg(c.getString(5));

                listaclientes.add(cliente);
        }

        return listaclientes;
    }
}

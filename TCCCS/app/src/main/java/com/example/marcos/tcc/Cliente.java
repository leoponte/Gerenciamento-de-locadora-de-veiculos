package com.example.marcos.tcc;

/**
 * Created by Marcos on 21/11/2017.
 */

public class Cliente {
    int codigo;
    String nome;
    String telefone;
    String rg;
    String cpf;
    String email;

    public Cliente(){

    }

    public Cliente(int codigo, String nome, String telefone, String rg, String cpf, String email){
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
    }

    public Cliente(String nome, String telefone, String rg, String cpf, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String  toString(){
        return getCodigo() + "-" + getNome() + "-" + getCpf();
    }
}

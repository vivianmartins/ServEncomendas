package com.bd.DAL;

import java.math.BigInteger;

public class Estafetas {

    private BigInteger nif;
    private String email;
    private String telefone;
    private String nome;
    private String password;


    public BigInteger getNif() {
        return nif;
    }

    public void setNif(BigInteger nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   public String getPassword() {
        return password;
    }



  public void setPassword(String password) {
        this.password = password;
    }



    public Estafetas(Estafeta e,Users u) {
        this.nif = BigInteger.valueOf(e.getNif());
        this.email = e.getEmail();
        this.telefone = e.getNumtelefone();
        this.nome = e.getNome();
        this.password = u.getPassword();
    }
}

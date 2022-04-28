package com.example.bd.DAL;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTES")
@NamedQueries({
        @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM  Clientes c"),
        @NamedQuery(name = "Clientes.findByIdcliente", query = "SELECT c FROM Clientes c WHERE c.idCliente = :id_cliente"),
        @NamedQuery(name = "Clientes.findAllByNome", query = "SELECT c FROM Clientes c WHERE c.nome LIKE :nome"),
})
public class Clientes {
    //GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_CLIENTE", nullable = false, precision = 0)
    private int idCliente;
    @Basic
    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;
    @Basic
    @Column(name = "NIF", nullable = false, precision = 0)
    private int nif;
    @Basic
    @Column(name = "RUA", nullable = false, length = 100)
    private String rua;
    @Basic
    @Column(name = "CODPOSTAL", nullable = false, length = 10)
    private String codpostal;
    @Basic
    @Column(name = "NUMTELEMOVEL", nullable = false, length = 20)
    private String numtelemovel;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getNumtelemovel() {
        return numtelemovel;
    }

    public void setNumtelemovel(String numtelemovel) {
        this.numtelemovel = numtelemovel;
    }
}

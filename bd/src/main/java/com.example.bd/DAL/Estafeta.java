package com.example.bd.DAL;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "Estafeta")
@NamedQueries({
        @NamedQuery(name = "Estafeta.findAll", query = "SELECT c FROM Estafeta c"),
        @NamedQuery(name = "Estafeta.findById_estafeta", query = "SELECT c FROM Estafeta c WHERE c.idEstafeta = :id_estafeta"),
        @NamedQuery(name = "Estafeta.findAllByNome", query = "SELECT c FROM Estafeta c WHERE c.nome LIKE :nome"),
})
public class Estafeta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ESTAFETA", nullable = false, precision = 0)
    private int idEstafeta;
    @Basic
    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;
    @Basic
    @Column(name = "NUMTELEFONE", nullable = true, length = 20)
    private String numtelefone;
    @Basic
    @Column(name = "NIF", nullable = false, precision = 0)
    private int nif;
    @Basic
    @Column(name = "EMAIL", nullable = true, length = 20)
    private String email;
    @Basic
    @Column(name = "ID_USER", nullable = true, precision = 0)
    private BigInteger idUser;

    public int getIdEstafeta() {
        return idEstafeta;
    }

    public void setIdEstafeta(int idEstafeta) {
        this.idEstafeta = idEstafeta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumtelefone() {
        return numtelefone;
    }

    public void setNumtelefone(String numtelefone) {
        this.numtelefone = numtelefone;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getIdUser() {
        return idUser;
    }

    public void setIdUser(BigInteger idUser) {
        this.idUser = idUser;
    }
}

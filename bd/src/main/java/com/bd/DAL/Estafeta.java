package com.bd.DAL;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "Estafeta")
@NamedQueries({
        @NamedQuery(name = "Estafeta.findAll", query = "SELECT c FROM Estafeta c"),
        @NamedQuery(name = "Estafeta.findById_estafeta", query = "SELECT c FROM Estafeta c WHERE c.idEstafeta = :id_estafeta"),
        @NamedQuery(name = "Estafeta.findByEstado" , query = "Select c From Estafeta c  where c.estado = :isestado" ),
        @NamedQuery(name = "Estafeta.findAllByNome", query = "SELECT c FROM Estafeta c WHERE c.nome LIKE :nome"),
       // @NamedQuery(name = "Estafeta.findAllPass", query = "select new com.bd.DAL.Estafetas (e, u)  from Estafeta  e, Users u where e.idEstafeta = u.idUser and  e.estado = :isestado"),
})


public class Estafeta {
    private int idEstafeta;
    private String nome;
    private String numtelefone;
    private int nif;
    private String email;
    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 50)
    private String password;
    private boolean estado;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "ESTADO", nullable = false, precision = 0)
    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ESTAFETA", nullable = false, precision = 0)
    public int getIdEstafeta() {
        return idEstafeta;
    }

    public void setIdEstafeta(int idEstafeta) {
        this.idEstafeta = idEstafeta;
    }

    @Basic
    @Column(name = "NOME", nullable = false, length = 100)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "NUMTELEFONE", nullable = true, length = 20)
    public String getNumtelefone() {
        return numtelefone;
    }

    public void setNumtelefone(String numtelefone) {
        this.numtelefone = numtelefone;
    }


    @Basic
    @Column(name = "NIF", nullable = false, precision = 0)
    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 20)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Estafeta estafeta = (Estafeta) o;

        if (idEstafeta != estafeta.idEstafeta) return false;
        if (nif != estafeta.nif) return false;
        if (nome != null ? !nome.equals(estafeta.nome) : estafeta.nome != null) return false;
        if (numtelefone != null ? !numtelefone.equals(estafeta.numtelefone) : estafeta.numtelefone != null)
            return false;
        if (email != null ? !email.equals(estafeta.email) : estafeta.email != null) return false;
        if (password != null ? !password.equals(estafeta.password) : estafeta.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEstafeta;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (numtelefone != null ? numtelefone.hashCode() : 0);
        result = 31 * result + nif;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }


}

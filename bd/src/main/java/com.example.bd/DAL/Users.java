package com.example.bd.DAL;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "USERS")
@NamedQueries({
        @NamedQuery(name = "Users.findAll", query = "SELECT c FROM Users c"),
        @NamedQuery(name = "Users.findByUser", query = "SELECT c FROM Users c WHERE c.idUser = :id_user"),
        @NamedQuery(name = "Users.findAllByEstafeta", query = "SELECT c FROM Users c WHERE c.isEstafeta = :estafeta"),
})
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_USER", nullable = false, precision = 0)
    private BigInteger idUser;
    @Basic
    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;
    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 100)
    private String password;
    @Basic
    @Column(name = "IS_ADMIN", nullable = false, precision = 0)
    private boolean isAdmin;
    @Basic
    @Column(name = "IS_GESTOR", nullable = false, precision = 0)
    private boolean isGestor;
    @Basic
    @Column(name = "IS_ESTAFETA", nullable = false, precision = 0)
    private boolean isEstafeta;
    @Basic
    @Column(name = "IS_COZINHEIRO", nullable = false, precision = 0)
    private boolean isCozinheiro;
    @Basic
    @Column(name = "NOMEUSER", nullable = false, length = 20)
    private String nomeuser;

    public BigInteger getIdUser() {
        return idUser;
    }

    public void setIdUser(BigInteger idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isGestor() {
        return isGestor;
    }

    public void setGestor(boolean gestor) {
        isGestor = gestor;
    }

    public boolean isEstafeta() {
        return isEstafeta;
    }

    public void setEstafeta(boolean estafeta) {
        isEstafeta = estafeta;
    }

    public boolean isCozinheiro() {
        return isCozinheiro;
    }

    public void setCozinheiro(boolean cozinheiro) {
        isCozinheiro = cozinheiro;
    }

    public String getNomeuser() {
        return nomeuser;
    }

    public void setNomeuser(String nomeuser) {
        this.nomeuser = nomeuser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (isAdmin != users.isAdmin) return false;
        if (isGestor != users.isGestor) return false;
        if (isEstafeta != users.isEstafeta) return false;
        if (isCozinheiro != users.isCozinheiro) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (isAdmin ? 1 : 0);
        result = 31 * result + (isGestor ? 1 : 0);
        result = 31 * result + (isEstafeta ? 1 : 0);
        result = 31 * result + (isCozinheiro ? 1 : 0);
        return result;
    }
}

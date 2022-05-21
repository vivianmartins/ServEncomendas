package com.example.bd.DAL;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "USERS")
@NamedQueries({
        @NamedQuery(name = "Users.findAll", query = "SELECT c FROM Users c"),
        @NamedQuery(name = "Users.findByUser", query = "SELECT c FROM Users c WHERE c.idUser = :id_user"),
        @NamedQuery(name = "Users.findByLogin", query =  "Select c From Users c WHERE c.email = :emailUser and c.password  = :pass"),
        @NamedQuery(name = "Users.findByGestor" , query = "Select c From Users c  where c.gestor = :is_gestor" ),
        @NamedQuery(name = "Users.findByCozinheiro" , query = "Select c From Users c  where c.cozinheiro = :is_cozinheiro" )
})
public class Users {
    private BigInteger idUser;
    private String email;
    private String password;
    private boolean isAdmin;
    private boolean isGestor;
    private boolean isEstafeta;
    private boolean isCozinheiro;
    private String nomeuser;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_USER", nullable = false, precision = 0)
    public BigInteger getIdUser() {
        return idUser;
    }

    public void setIdUser(BigInteger idUser) {
        this.idUser = idUser;
    }


    @Basic
    @Column(name = "EMAIL", nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "IS_ADMIN", nullable = false, precision = 0)
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Basic
    @Column(name = "IS_GESTOR", nullable = false, precision = 0)
    public boolean isGestor() {
        return isGestor;
    }

    public void setGestor(boolean gestor) {
        isGestor = gestor;
    }

    @Basic
    @Column(name = "IS_ESTAFETA", nullable = false, precision = 0)
    public boolean isEstafeta() {
        return isEstafeta;
    }

    public void setEstafeta(boolean estafeta) {
        isEstafeta = estafeta;
    }

    @Basic
    @Column(name = "IS_COZINHEIRO", nullable = false, precision = 0)
    public boolean isCozinheiro() {
        return isCozinheiro;
    }

    public void setCozinheiro(boolean cozinheiro) {
        isCozinheiro = cozinheiro;
    }

    @Basic
    @Column(name = "NOMEUSER", nullable = false, length = 20)
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

        if (idUser != null ? !idUser.equals(users.idUser) : users.idUser != null) return false;
        if (email != null ? !email.equals(users.email) : users.email != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (nomeuser != null ? !nomeuser.equals(users.nomeuser) : users.nomeuser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser != null ? idUser.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nomeuser != null ? nomeuser.hashCode() : 0);
        return result;
    }
}

package com.example.bd.DAL;

import javax.persistence.*;

@Entity
@Table(name = "CODPOSTAIS")
@NamedQueries({
        @NamedQuery(name = "CodPostais.findAll", query = "SELECT c FROM Codpostais c"),
        @NamedQuery(name = "CodPostais.findBycod", query = "SELECT c FROM Codpostais c WHERE c.codpostal = :codpostal"),
        @NamedQuery(name = "CodPostais.findAllByLocalidade", query = "SELECT c FROM Codpostais c WHERE c.localidade LIKE :Localidade"),
})
public class Codpostais {
   //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODPOSTAL", nullable = false, length = 10)
    private String codpostal;
    @Basic
    @Column(name = "LOCALIDADE", nullable = false, length = 100)
    private String localidade;

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
}

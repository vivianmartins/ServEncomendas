package com.example.bd.DAL;

import javax.persistence.*;

@Entity
@Table(name = "PRATOS")
@NamedQueries({
        @NamedQuery(name = "Pratos.findAll", query = "SELECT p FROM Pratos p"),
        @NamedQuery(name = "Pratos.findById_Pratos", query = "SELECT p FROM Pratos p WHERE  p.idPrato = :id_prato"),
        @NamedQuery(name = "Pratos.findAllByDescricao", query = "SELECT c FROM Pratos c WHERE c.descricao LIKE :DESCRICAO")
})
public class Pratos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PRATO", nullable = false, precision = 0)
    private int idPrato;
    @Basic
    @Column(name = "DESCRICAO", nullable = false, length = 150)
    private String descricao;
    @Basic
    @Column(name = "STOCKDOSES", nullable = false, precision = 0)
    private double stockdoses;
    @Basic
    @Column(name = "PRECOATUAL", nullable = false, precision = 0)
    private double precoatual;

    public int getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(int idPrato) {
        this.idPrato = idPrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getStockdoses() {
        return stockdoses;
    }

    public void setStockdoses(double stockdoses) {
        this.stockdoses = stockdoses;
    }

    public double getPrecoatual() {
        return precoatual;
    }

    public void setPrecoatual(double precoatual) {
        this.precoatual = precoatual;
    }
}

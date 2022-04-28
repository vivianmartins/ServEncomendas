package com.example.bd.DAL;

import javax.persistence.*;

@Entity
@Table(name = "TipoPagamentos")
@NamedQueries({
        @NamedQuery(name = "Tipopagamento.findAll", query = "SELECT c FROM Tipopagamentos c"),
        @NamedQuery(name = "Tipopagamento.findBytipopagamentoid", query = "SELECT c FROM Tipopagamentos c WHERE c.tipopagamentoid = :tipopagamentoid"),
        @NamedQuery(name = "Tipopgamento.findAllByDescricao", query = "SELECT c FROM Tipopagamentos c WHERE c.descricao LIKE :descricao"),
})
public class Tipopagamentos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TIPOPAGAMENTOID", nullable = false, precision = 0)
    private int tipopagamentoid;
    @Basic
    @Column(name = "DESCRICAO", nullable = false, length = 100)
    private String descricao;

    public int getTipopagamentoid() {
        return tipopagamentoid;
    }

    public void setTipopagamentoid(int tipopagamentoid) {
        this.tipopagamentoid = tipopagamentoid;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

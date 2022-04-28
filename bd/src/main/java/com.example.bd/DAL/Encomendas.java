package com.example.bd.DAL;

import javax.persistence.*;

@Entity
@Table(name = "ENCOMENDAS")
@NamedQueries({
        @NamedQuery(name = "Encomendas.findAll", query = "SELECT c FROM Encomendas c"),
        @NamedQuery(name = "Encomendas.findByIdencomenda", query = "SELECT c FROM Encomendas c WHERE c.idEncomenda = :id_encomenda"),
        @NamedQuery(name = "Encomendas.findAllByTipoPagamento", query = "SELECT c FROM Encomendas c WHERE c.tipopagamentoid = :id_tipopagamento"),
})
public class Encomendas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ENCOMENDA", nullable = false, precision = 0)
    private int idEncomenda;
    @Basic
    @Column(name = "VALORTOTAL", nullable = false, precision = 0)
    private double valortotal;
    @Basic
    @Column(name = "ID_CLIENTE", nullable = false, precision = 0)
    private int idCliente;
    @Basic
    @Column(name = "ID_ESTAFETA", nullable = true, precision = 0)
    private Integer idEstafeta;
    @Basic
    @Column(name = "TIPOPAGAMENTOID", nullable = false, precision = 0)
    private int tipopagamentoid;

    public int getIdEncomenda() {
        return idEncomenda;
    }

    public void setIdEncomenda(int idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdEstafeta() {
        return idEstafeta;
    }

    public void setIdEstafeta(Integer idEstafeta) {
        this.idEstafeta = idEstafeta;
    }

    public int getTipopagamentoid() {
        return tipopagamentoid;
    }

    public void setTipopagamentoid(int tipopagamentoid) {
        this.tipopagamentoid = tipopagamentoid;
    }
}

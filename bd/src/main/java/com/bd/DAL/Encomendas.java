package com.bd.DAL;

import javax.persistence.*;

@Entity
@Table(name = "ENCOMENDAS")
@NamedQueries({
        @NamedQuery(name = "Encomendas.findAll", query = "SELECT c FROM Encomendas c"),
        @NamedQuery(name = "Encomendas.findByIdencomenda", query = "SELECT c FROM Encomendas c WHERE c.idEncomenda = :id_encomenda"),
        @NamedQuery(name = "Encomendas.findAllByTipoPagamento", query = "SELECT c FROM Encomendas c WHERE c.tipopagamentoid = :id_tipopagamento"),
        @NamedQuery(name = "Encomendas.findAllPed",  query = "select distinct new   com.bd.DAL.listaPedidos  (en, pr, ee, pre)  from Encomendas  en, Pratos  pr, Encomendaestados ee, PratosEncomendados pre where en.idEncomenda = pre.idEncomenda "),

})

public class Encomendas {
    private int idEncomenda;
    private int valortotal;
    private int idCliente;
    private Integer idEstafeta;
    private int tipopagamentoid;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ENCOMENDA", nullable = false, precision = 0)
    public int getIdEncomenda() {
        return idEncomenda;
    }

    public void setIdEncomenda(int idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    @Basic
    @Column(name = "VALORTOTAL", nullable = false, precision = 2)
    public int getValortotal() {
        return valortotal;
    }

    public void setValortotal(int valortotal) {
        this.valortotal = valortotal;
    }

    @Basic
    @Column(name = "ID_CLIENTE", nullable = false, precision = 0)
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    @Basic
    @Column(name = "ID_ESTAFETA", nullable = true, precision = 0)
    public Integer getIdEstafeta() {
        return idEstafeta;
    }

    public void setIdEstafeta(Integer idEstafeta) {
        this.idEstafeta = idEstafeta;
    }

    @Basic
    @Column(name = "TIPOPAGAMENTOID", nullable = false, precision = 0)
    public int getTipopagamentoid() {
        return tipopagamentoid;
    }

    public void setTipopagamentoid(int tipopagamentoid) {
        this.tipopagamentoid = tipopagamentoid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Encomendas that = (Encomendas) o;

        if (idEncomenda != that.idEncomenda) return false;
        if (valortotal != that.valortotal) return false;
        if (idCliente != that.idCliente) return false;
        if (tipopagamentoid != that.tipopagamentoid) return false;
        if (idEstafeta != null ? !idEstafeta.equals(that.idEstafeta) : that.idEstafeta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEncomenda;
        result = 31 * result + valortotal;
        result = 31 * result + idCliente;
        result = 31 * result + (idEstafeta != null ? idEstafeta.hashCode() : 0);
        result = 31 * result + tipopagamentoid;
        return result;
    }
}

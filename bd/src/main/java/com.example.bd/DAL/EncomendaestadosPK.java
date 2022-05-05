package com.example.bd.DAL;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class EncomendaestadosPK implements Serializable {
    private int idEncomenda;
    private int idEstadoencomenda;

    @Column(name = "ID_ENCOMENDA", nullable = false, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdEncomenda() {
        return idEncomenda;
    }

    public void setIdEncomenda(int idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    @Column(name = "ID_ESTADOENCOMENDA", nullable = false, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdEstadoencomenda() {
        return idEstadoencomenda;
    }

    public void setIdEstadoencomenda(int idEstadoencomenda) {
        this.idEstadoencomenda = idEstadoencomenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EncomendaestadosPK that = (EncomendaestadosPK) o;

        if (idEncomenda != that.idEncomenda) return false;
        if (idEstadoencomenda != that.idEstadoencomenda) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEncomenda;
        result = 31 * result + idEstadoencomenda;
        return result;
    }
}

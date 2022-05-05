package com.example.bd.DAL;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class PratosEncomendadosPK implements Serializable {
    private int idPrato;
    private int idEncomenda;

    @Column(name = "ID_PRATO", nullable = false, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(int idPrato) {
        this.idPrato = idPrato;
    }

    @Column(name = "ID_ENCOMENDA", nullable = false, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdEncomenda() {
        return idEncomenda;
    }

    public void setIdEncomenda(int idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PratosEncomendadosPK that = (PratosEncomendadosPK) o;

        if (idPrato != that.idPrato) return false;
        if (idEncomenda != that.idEncomenda) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPrato;
        result = 31 * result + idEncomenda;
        return result;
    }
}

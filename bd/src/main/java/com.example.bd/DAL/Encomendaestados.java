package com.example.bd.DAL;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ENCOMENDAESTADOS")
@NamedQueries({
        @NamedQuery(name = "Encomendaestados.findAll", query = "SELECT c FROM Encomendaestados c"),
        @NamedQuery(name = "Encomendaestados.findByIdencomenda", query = "SELECT c FROM Encomendaestados c WHERE c.idEncomenda = :id_encomenda"),
        @NamedQuery(name = "Encomendaestados.findAllByIdEstadoEncomenda", query = "SELECT c FROM Encomendaestados c WHERE c.idEstadoencomenda = :id_estadoEnc"),
})
@IdClass(EncomendaestadosPK.class)
public class Encomendaestados {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ENCOMENDA", nullable = false, precision = 0)
    private int idEncomenda;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ESTADOENCOMENDA", nullable = false, precision = 0)
    private int idEstadoencomenda;
    @Basic
    @Column(name = "DATA", nullable = false)
    private Date data;

    public int getIdEncomenda() {
        return idEncomenda;
    }

    public void setIdEncomenda(int idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    public int getIdEstadoencomenda() {
        return idEstadoencomenda;
    }

    public void setIdEstadoencomenda(int idEstadoencomenda) {
        this.idEstadoencomenda = idEstadoencomenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}

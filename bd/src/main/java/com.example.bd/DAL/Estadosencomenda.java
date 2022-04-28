package com.example.bd.DAL;

import javax.persistence.*;

@Entity
@Table(name = "ESTADOSENCOMENDA")
@NamedQueries({
        @NamedQuery(name = "Estadosencomenda.findAll", query = "SELECT c FROM Estadosencomenda c"),
        @NamedQuery(name = "Estadosencomenda.findAllByDescricaoEstado", query = "SELECT c FROM Estadosencomenda c WHERE c.descricaoestado = :descricaoestado"),
})
public class Estadosencomenda {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ESTADOENCOMENDA", nullable = false, precision = 0)
    private int idEstadoencomenda;
    @Basic
    @Column(name = "DESCRICAOESTADO", nullable = false, length = 50)
    private String descricaoestado;

    public int getIdEstadoencomenda() {
        return idEstadoencomenda;
    }

    public void setIdEstadoencomenda(int idEstadoencomenda) {
        this.idEstadoencomenda = idEstadoencomenda;
    }

    public String getDescricaoestado() {
        return descricaoestado;
    }

    public void setDescricaoestado(String descricaoestado) {
        this.descricaoestado = descricaoestado;
    }
}

package com.example.bd.DAL;

import javax.persistence.*;

@Entity
@Table(name = "PRATOS_ENCOMENDADOS",  schema = "PROJETOBD", catalog = "")
@NamedQueries({
        @NamedQuery(name = "PratosEncomendados.findAll", query = "SELECT c FROM PratosEncomendados c"),
        @NamedQuery(name = "PratosEncomendado.findById_encomendas", query = "SELECT c FROM PratosEncomendados c WHERE c.idEncomenda = :id_encomendas"),
        @NamedQuery(name = "PratosEncomendados.findAllByIdprato", query = "SELECT c FROM PratosEncomendados c WHERE c.idPrato = :ID_PRATO"),
})
@IdClass(PratosEncomendadosPK.class)
public class PratosEncomendados {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PRATO", nullable = false, precision = 0)
    private int idPrato;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ENCOMENDA", nullable = false, precision = 0)
    private int idEncomenda;
    @Basic
    @Column(name = "QTDDOSES", nullable = false, precision = 0)
    private double qtddoses;
    @Basic
    @Column(name = "PRECODOSE", nullable = false, precision = 0)
    private double precodose;

    public int getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(int idPrato) {
        this.idPrato = idPrato;
    }

    public int getIdEncomenda() {
        return idEncomenda;
    }

    public void setIdEncomenda(int idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    public double getQtddoses() {
        return qtddoses;
    }

    public void setQtddoses(double qtddoses) {
        this.qtddoses = qtddoses;
    }

    public double getPrecodose() {
        return precodose;
    }

    public void setPrecodose(double precodose) {
        this.precodose = precodose;
    }
}

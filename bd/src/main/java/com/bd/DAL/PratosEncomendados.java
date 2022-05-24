package com.bd.DAL;

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
    private int idPrato;
    private int idEncomenda;
    private int qtddoses;
    private int precodose;

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PRATO", nullable = false, precision = 0)
    public int getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(int idPrato) {
        this.idPrato = idPrato;
    }

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
    @Column(name = "QTDDOSES", nullable = false, precision = 2)
    public int getQtddoses() {
        return qtddoses;
    }

    public void setQtddoses(int qtddoses) {
        this.qtddoses = qtddoses;
    }

    @Basic
    @Column(name = "PRECODOSE", nullable = false, precision = 2)
    public int getPrecodose() {
        return precodose;
    }

    public void setPrecodose(int precodose) {
        this.precodose = precodose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PratosEncomendados that = (PratosEncomendados) o;

        if (idPrato != that.idPrato) return false;
        if (idEncomenda != that.idEncomenda) return false;
        if (qtddoses != that.qtddoses) return false;
        if (precodose != that.precodose) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPrato;
        result = 31 * result + idEncomenda;
        result = 31 * result + qtddoses;
        result = 31 * result + precodose;
        return result;
    }
}

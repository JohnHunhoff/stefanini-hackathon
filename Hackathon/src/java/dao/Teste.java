/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author stefanini
 */
@Entity
@Table(name = "teste")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teste.findAll", query = "SELECT t FROM Teste t"),
    @NamedQuery(name = "Teste.findByTeste", query = "SELECT t FROM Teste t WHERE t.teste = :teste")})
public class Teste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "teste")
    private String teste;

    public Teste() {
    }

    public Teste(String teste) {
        this.teste = teste;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teste != null ? teste.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teste)) {
            return false;
        }
        Teste other = (Teste) object;
        if ((this.teste == null && other.teste != null) || (this.teste != null && !this.teste.equals(other.teste))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Teste[ teste=" + teste + " ]";
    }
    
}

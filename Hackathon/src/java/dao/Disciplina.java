/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author stefanini
 */

@Entity
@Table(name = "disciplina")
public class Disciplina implements Serializable{
       
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_disciplina")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Column(name = "name")
    private String nome;
    
    @NotNull
    @Column(name = "coneudoProgramatico")
    private String coneudoProgramatico;
    
    @NotNull
    @Column(name = "numeroCredito")
    private String numeroCredito;
    
    @NotNull
    @Column(name = "totalHora")
    private int totalHora;
    
    @JoinColumn(name = "curso", referencedColumnName = "id_curso")
    @ManyToOne
    private Curso curso;

    public Disciplina(){
        
    }
    
    public Disciplina(Long id, String nome, String coneudoProgramatico, String numeroCredito, int totalHora) {
        this.id = id;
        this.nome = nome;
        this.coneudoProgramatico = coneudoProgramatico;
        this.numeroCredito = numeroCredito;
        this.totalHora = totalHora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConeudoProgramatico() {
        return coneudoProgramatico;
    }

    public void setConeudoProgramatico(String coneudoProgramatico) {
        this.coneudoProgramatico = coneudoProgramatico;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }

    public void setNumeroCredito(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public int getTotalHora() {
        return totalHora;
    }

    public void setTotalHora(int totalHora) {
        this.totalHora = totalHora;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author stefanini
 */

@Entity
@Table(name = "turma")
public class Turma implements Serializable{
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_turma")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    private List<Aluno> alunos;
    
    @NotNull
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "id_disciplina")
    private Disciplina disciplina;
    
    public Turma(){
        
    }
    
    public Turma(Long id, List<Aluno> alunos, Disciplina disciplina) {
        this.id = id;
        this.alunos = alunos;
        this.disciplina = disciplina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    
}

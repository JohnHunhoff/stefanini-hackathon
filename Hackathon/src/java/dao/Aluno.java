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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author stefanini
 */

@Entity
@Table(name = "aluno")
public class Aluno implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Column(name = "name")
    private String nome;
    
    @NotNull
    @Column(name = "matricula")
    private String  matricula;
    
    @NotNull
    @Column(name = "endereco")
    private String endereco;
    
    @NotNull
    @Column(name = "cpf")
    private String cpf;
    
    @JoinColumn(name = "turma", referencedColumnName = "id_turma")
    @ManyToOne
    private Turma turma;

    public Aluno(){
        
    }
    
    public Aluno(Long id, String nome, String matricula, String endereco, String cpf) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
}

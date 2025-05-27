package com.TempestaGui.CursoSpring.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer matricula;
    private Integer idade;
    private String materias;
    private String email;
    private String telefone;
    private String cidade;

    public Professor() {}

    public Professor(Long id, String cidade, String telefone, String email, String materias,
                     Integer idade, Integer matricula, String nome) {
        this.id = id;
        this.cidade = cidade;
        this.telefone = telefone;
        this.email = email;
        this.materias = materias;
        this.idade = idade;
        this.matricula = matricula;
        this.nome = nome;
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

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(matricula, professor.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}


package com.TempestaGui.CursoSpring.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Tb_cursos")
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Integer cargaHoraria;
    private String professor;

    public Cursos() {
    }
    public Cursos(String nome, String descricao, Integer cargaHoraria, String professor) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cursos cursos = (Cursos) o;
        return Objects.equals(id, cursos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

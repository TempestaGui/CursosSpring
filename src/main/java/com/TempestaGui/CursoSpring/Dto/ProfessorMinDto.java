package com.TempestaGui.CursoSpring.Dto;

import com.TempestaGui.CursoSpring.entities.Professor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProfessorMinDto {
    private Long id;
    private String nome;
    private Integer matricula;
    private String materia;
    private String email;

    public ProfessorMinDto(){
    }

    public ProfessorMinDto(Professor Entity) {
        id = Entity.getId();
        nome = Entity.getNome();
        matricula = Entity.getMatricula();
        materia = Entity.getMateria();
        email = Entity.getEmail();
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.TempestaGui.CursoSpring.Dto;

import com.TempestaGui.CursoSpring.entities.Aluno;
import com.TempestaGui.CursoSpring.projections.AlunoMinProjection;

public class AlunoMinDto {
    private Long id;
    private String nome;
    private Integer matricula;
    private String curso;

    public AlunoMinDto(){
    }

    public AlunoMinDto(Aluno Entity) {
        id = Entity.getId();
        nome = Entity.getNome();
        matricula = Entity.getMatricula();
        curso = Entity.getCurso();
    }
    public AlunoMinDto(AlunoMinProjection Projection) {
        id = Projection.getId();
        nome = Projection.getNome();
        matricula = Projection.getMatricula();
        curso = Projection.getCurso();
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
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

}

package com.TempestaGui.CursoSpring.Dto;

import com.TempestaGui.CursoSpring.entities.Aluno;

public class AlunoMinDto {
    private Long id;
    private String nome;
    private Integer matricula;
    private String curso;
    private String email;

    public AlunoMinDto(){
    }

    public AlunoMinDto(Aluno Entity) {
        id = Entity.getId();
        nome = Entity.getNome();
        matricula = Entity.getMatricula();
        curso = Entity.getCurso();
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
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}

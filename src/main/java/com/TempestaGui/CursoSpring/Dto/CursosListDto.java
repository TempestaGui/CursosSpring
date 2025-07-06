package com.TempestaGui.CursoSpring.Dto;

import com.TempestaGui.CursoSpring.lists.CursosLists;

public class CursosListDto {

    private Long id;
    private String nome;

    public CursosListDto() {}

    public CursosListDto(CursosLists Entity) {
    this.id = Entity.getId();
     this.nome = Entity.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}

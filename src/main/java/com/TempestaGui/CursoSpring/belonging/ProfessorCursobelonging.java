package com.TempestaGui.CursoSpring.belonging;


import com.TempestaGui.CursoSpring.belongingPK.ProfessorCursoBelongingPK;
import com.TempestaGui.CursoSpring.entities.Cursos;
import com.TempestaGui.CursoSpring.entities.Professor;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_professor_curso")
public class ProfessorCursobelonging {
    @EmbeddedId
    private ProfessorCursoBelongingPK id = new ProfessorCursoBelongingPK();
    private Integer position;

    public ProfessorCursobelonging() {
    }

    public ProfessorCursobelonging(Professor professor, Cursos curso , Integer position) {
        this.id.setCurso(curso);
        this.id.setProfessor(professor);
        this.position = position;
    }

    public ProfessorCursoBelongingPK getId() {
        return id;
    }

    public void setId(ProfessorCursoBelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProfessorCursobelonging that = (ProfessorCursobelonging) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

package com.TempestaGui.CursoSpring.belongingPK;

import com.TempestaGui.CursoSpring.entities.Cursos;
import com.TempestaGui.CursoSpring.entities.Professor;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class ProfessorCursoBelongingPK {
    @ManyToOne
    @JoinColumn(name = "id_professor")
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Cursos curso;

    public ProfessorCursoBelongingPK(){}

    public ProfessorCursoBelongingPK(Professor professor, Cursos curso){
        this.professor = professor;
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProfessorCursoBelongingPK that = (ProfessorCursoBelongingPK) o;
        return Objects.equals(professor, that.professor) && Objects.equals(curso, that.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(professor, curso);
    }
}

package com.TempestaGui.CursoSpring.belongingPK;

import com.TempestaGui.CursoSpring.entities.Aluno;
import com.TempestaGui.CursoSpring.entities.Cursos;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class AlunoCursoBelongingPK {
    @ManyToOne
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Cursos cursos;

   public AlunoCursoBelongingPK(){}

    public AlunoCursoBelongingPK(Aluno aluno, Cursos cursos){
        this.aluno = aluno;
        this.cursos = cursos;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AlunoCursoBelongingPK that = (AlunoCursoBelongingPK) o;
        return Objects.equals(aluno, that.aluno) && Objects.equals(cursos, that.cursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno, cursos);
    }
}

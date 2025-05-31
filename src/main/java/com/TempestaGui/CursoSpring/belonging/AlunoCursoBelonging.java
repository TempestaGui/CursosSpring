package com.TempestaGui.CursoSpring.belonging;

import com.TempestaGui.CursoSpring.belongingPK.AlunoCursoBelongingPK;
import com.TempestaGui.CursoSpring.entities.Aluno;
import com.TempestaGui.CursoSpring.entities.Cursos;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

@Entity
@Table(name = "tb_aluno_curso")
public class AlunoCursoBelonging {

    @EmbeddedId
    private AlunoCursoBelongingPK id = new AlunoCursoBelongingPK();
    private Integer position;
    private Integer nota;

    public AlunoCursoBelonging() {}
    public AlunoCursoBelonging(Aluno aluno, Cursos cursos, Integer position, Integer nota) {
        this.id.setAluno(aluno);
        this.id.setCursos(cursos);
        this.position = position;
        this.nota = nota;
    }

    public AlunoCursoBelongingPK getId() {
        return id;
    }

    public void setId(AlunoCursoBelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AlunoCursoBelonging that = (AlunoCursoBelonging) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

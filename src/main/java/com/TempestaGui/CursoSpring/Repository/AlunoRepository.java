package com.TempestaGui.CursoSpring.Repository;

import com.TempestaGui.CursoSpring.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}

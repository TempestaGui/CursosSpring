package com.TempestaGui.CursoSpring.Repository;

import com.TempestaGui.CursoSpring.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}

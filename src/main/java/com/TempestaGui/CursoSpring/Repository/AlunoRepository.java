package com.TempestaGui.CursoSpring.Repository;

import com.TempestaGui.CursoSpring.entities.Aluno;
import com.TempestaGui.CursoSpring.projections.AlunoMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

   @Query(nativeQuery = true, value = """
        SELECT tb_aluno.id , tb_aluno.matricula, tb_aluno.nome, tb_aluno.curso, tb_aluno_curso.position
        FROM tb_aluno
        INNER JOIN tb_aluno_curso
        ON tb_aluno.id = tb_aluno_curso.id_aluno
        WHERE tb_aluno_curso.id_curso = :cursoId
        ORDER BY tb_aluno_curso.position
    """)
   List<AlunoMinProjection> searchByCurso(long cursoId);
}



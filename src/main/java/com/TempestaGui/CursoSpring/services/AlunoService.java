package com.TempestaGui.CursoSpring.services;
import java.util.List;
import com.TempestaGui.CursoSpring.Dto.AlunoMinDto;
import com.TempestaGui.CursoSpring.Repository.AlunoRepository;
import com.TempestaGui.CursoSpring.entities.Aluno;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Transactional(readOnly = true)
    public AlunoMinDto findAlunoById(Long id) {
        Aluno result = alunoRepository.findById(id).get();
        return new AlunoMinDto(result);
    }
    @Transactional(readOnly = true)
    public List<AlunoMinDto> findAll(){
        List<Aluno> result = alunoRepository.findAll();
        List<AlunoMinDto> dto = result.stream().map(x -> new AlunoMinDto(x)).toList();
        return dto;
    }
}

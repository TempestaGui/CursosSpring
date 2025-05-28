package com.TempestaGui.CursoSpring.services;

import com.TempestaGui.CursoSpring.Dto.ProfessorMinDto;
import com.TempestaGui.CursoSpring.Repository.ProfessorRepository;
import com.TempestaGui.CursoSpring.entities.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorServices {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<ProfessorMinDto> findAll(){
        List<Professor> result = professorRepository.findAll();
        List<ProfessorMinDto> dto = result.stream().map(x -> new ProfessorMinDto(x)).toList();
        return dto;
    }
}

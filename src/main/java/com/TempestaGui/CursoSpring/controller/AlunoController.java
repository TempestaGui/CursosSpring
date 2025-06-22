package com.TempestaGui.CursoSpring.controller;

import com.TempestaGui.CursoSpring.Dto.AlunoMinDto;
import com.TempestaGui.CursoSpring.entities.Aluno;
import com.TempestaGui.CursoSpring.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoMinDto> findAll(){
        List<AlunoMinDto> result = alunoService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public AlunoMinDto findById(@PathVariable Long id){
        return alunoService.findAlunoById(id);
    }
}

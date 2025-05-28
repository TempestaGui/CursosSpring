package com.TempestaGui.CursoSpring.controller;

import com.TempestaGui.CursoSpring.Dto.ProfessorMinDto;
import com.TempestaGui.CursoSpring.services.ProfessorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {
    @Autowired
    private ProfessorServices professorServices;

    @GetMapping
    public List<ProfessorMinDto> findAll(){
        return professorServices.findAll();
    }
}

package com.TempestaGui.CursoSpring.controller;

import com.TempestaGui.CursoSpring.entities.Cursos;
import com.TempestaGui.CursoSpring.services.CursosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cursos")
public class CursosController {

    @Autowired
    private CursosServices cursosServices;

    @GetMapping(value = "/{id}")
    public Cursos findById(@PathVariable Long id){
        return cursosServices.findById(id);
    }

    @GetMapping
    public List<Cursos> findAll() {
        return cursosServices.findAll();
    }
}

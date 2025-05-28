package com.TempestaGui.CursoSpring.services;

import com.TempestaGui.CursoSpring.Repository.CursosRepository;
import com.TempestaGui.CursoSpring.entities.Cursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursosServices {
    @Autowired
    private CursosRepository cursosRepository;

    public List<Cursos> findAll(){
        List<Cursos> cursosList = cursosRepository.findAll();
        return cursosList;
    }
}

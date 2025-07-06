package com.TempestaGui.CursoSpring.services;

import com.TempestaGui.CursoSpring.Dto.CursosListDto;
import com.TempestaGui.CursoSpring.Repository.CursosListRepository;
import com.TempestaGui.CursoSpring.Repository.CursosRepository;
import com.TempestaGui.CursoSpring.entities.Cursos;
import com.TempestaGui.CursoSpring.lists.CursosLists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CursosListServices {
    @Autowired
    private CursosListRepository cursosListRepository;


    @Transactional(readOnly = true)
    public List<CursosListDto> findAll(){
        List<CursosLists> result = cursosListRepository.findAll();
        return result .stream().map(x -> new CursosListDto(x)).toList();
    }
}

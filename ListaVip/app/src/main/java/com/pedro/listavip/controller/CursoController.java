package com.pedro.listavip.controller;

import com.pedro.listavip.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoController {

    private List cursos;

    public List getListaCursos(){

        cursos= new ArrayList<Curso>();

        cursos.add(new Curso("Ciência da Computação"));
        cursos.add(new Curso("Engenharia de Software"));
        cursos.add(new Curso("Engenharia Civil"));
        cursos.add(new Curso("Engrnharia de Produção"));
        cursos.add(new Curso("Engenharia Mecanica"));

        return cursos;
    }
}

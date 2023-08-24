package com.pedro.listavip.model;

public class Curso {

    private String cursoDesejado;

    public Curso(String cursoDesejado) {
        this.cursoDesejado= cursoDesejado;

    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }
}

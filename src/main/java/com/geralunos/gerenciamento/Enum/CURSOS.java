package com.geralunos.gerenciamento.Enum;

public enum CURSOS {

    ADMINISTRACAO("Administracao"),
    INFORMATICA("Informatica"),
    ENFERMAGEM("Enfermagem");

    private String curso;
    private CURSOS(String curso){
        this.curso = curso;
    }

}

package com.geralunos.gerenciamento.Model;

import com.geralunos.gerenciamento.Enum.CURSOS;
import com.geralunos.gerenciamento.Enum.STATUS;
import jakarta.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private CURSOS curso;
    private String matricula;
    @Enumerated(EnumType.STRING)
    private STATUS status;
    private String turno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CURSOS getCurso() {
        return curso;
    }

    public void setCurso(CURSOS curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}

package com.geralunos.gerenciamento.Enum;

public enum STATUS {

    ATIVO("Ativo"),
    INATIVO("Inativo"),
    TRANCADO("Trancado");

    private String status;
    private STATUS(String status){
        this.status = status;
    }
}

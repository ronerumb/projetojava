package com.os.os.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @OneToMany(mappedBy = "cliente")
    private List<OrdemServico> list = new ArrayList<>();
    public Cliente() {
        super();
    }

    public Cliente(Integer id, String nome, String cpf, String telefone) {
        super(id, nome, cpf, telefone);
    }

    public List<OrdemServico> getList() {
        return list;
    }

    public void setList(List<OrdemServico> list) {
        this.list = list;
    }
}

package com.geralunos.gerenciamento.Repository;

import com.geralunos.gerenciamento.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}

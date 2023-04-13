package com.geralunos.gerenciamento.Controllers;

import com.geralunos.gerenciamento.Model.Aluno;
import com.geralunos.gerenciamento.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;
    @GetMapping("/inserirAluno")
    public ModelAndView inserAluno(Aluno aluno){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aluno/formAluno");
        mv.addObject("aluno",new Aluno());
        return mv;

    }

    @PostMapping("insertAluno")
    public ModelAndView inserirAuno(Aluno aluno){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect: /aluno/listAluno");
        alunoRepository.save(aluno);
        return mv;


    }
}

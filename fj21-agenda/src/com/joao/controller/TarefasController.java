package com.joao.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joao.entidade.Tarefa;
import com.joao.entidade.contato;

@Controller
public class TarefasController {

  @RequestMapping("adicionaTarefa")
  public String adiciona(@Valid Tarefa tarefa, BindingResult result) {// O Spring guarda os erros de validação (@valid) em um objeto BindingResult
	  
	  System.out.println(result.hasFieldErrors());
	  
//	  if (tarefa.getDescricao() == null || tarefa.getDescricao().equals(""))  A verificação agora será feita com a anotação @NOtNUll na classe Tarefa.java
//		  return "tarefa/formulario";
	  if(result.hasErrors() || result.hasFieldErrors()) {
		  return "tarefa/formulario";
	  }
	  System.out.println(tarefa.toString());
	  
//    JdbcTarefaDao dao = new JdbcTarefaDao();
//    dao.adiciona(tarefa);
    return "tarefa/tarefa-adicionada";
  }
  
  @RequestMapping("novaTarefa")
  public String form() {
	
    return "tarefa/formulario";
  }
  
  @RequestMapping("listaTarefas")
  public String lista(Model model){

	  model.addAttribute("listaDeTarefas", new Tarefa().getListaTarefa());
	  
	  System.out.println("adiciona tarelas");
	  
	  return "tarefa/lista-tarefa";
  }
  
  @RequestMapping("removeTarefa")
  public String removeTarefa(Tarefa tarefa){
	  
	  System.out.println("remove tarefas");
	  
	  return "forward:listaTarefas";
	  
  }
  
}
package com.joao.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joao.entidade.contato;

public class RemoveContatoLogic implements Logica {

	  public String executa(HttpServletRequest req, HttpServletResponse res)
	      throws Exception {

	    long id = Long.parseLong(req.getParameter("id"));

	    contato contato = new contato();
	    contato.setId(id);
	    
	    System.out.println("Excluindo contato... ");

	    return "mcv?logica=ListaContatosLogic";
	  }
}

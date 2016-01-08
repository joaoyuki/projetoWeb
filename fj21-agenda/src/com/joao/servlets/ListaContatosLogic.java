package com.joao.servlets;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joao.entidade.contato;

public class ListaContatosLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		List<contato> lista = new contato().getLista();
		
		req.setAttribute("contatos", lista);
		
		return "lista-contatos.jsp";
	}

}

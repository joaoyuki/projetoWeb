package com.joao.entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Tarefa {


	  private Long id;
	  
	  @NotNull(message="O campo não pode ser nulo") 
	  @Size(min=5, message="tarefa.descricao.pequena")// Está no arquivo validationMessages.properties, que deve ficar na pasta src
	  private String descricao;
	  
	  @NotNull
	  private String nome;
	  
	  private boolean finalizado;
	  private Calendar dataFinalizacao;
	  
	  public Tarefa(){
		  
	  }
	  
	  public Tarefa(String descricao){
		  this.descricao = descricao;
	  }
	  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}



	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", descricao=" + descricao + ", nome=" + nome + ", finalizado=" + finalizado
				+ ", dataFinalizacao=" + dataFinalizacao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Tarefa> getListaTarefa(){
		
		List<Tarefa> listaDeTarefa = new ArrayList<Tarefa>();
		listaDeTarefa.add(new Tarefa("teste 01"));
		listaDeTarefa.add(new Tarefa("teste 02"));
		
		return listaDeTarefa;
	}
	  
}

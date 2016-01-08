package com.joao.entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class contato {

	public contato(){
		
	}
	
	public contato(long id, String nome){
		this.id = id;
		this.nome = nome;
	}
	
	private long id;
    private String nome;
    private String endereco;
    private String email;
    private String dataEmTexto;
    private Calendar dataNascimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataEmTexto() {
		return dataEmTexto;
	}
	public void setDataEmTexto(String dataEmTexto) {
		this.dataEmTexto = dataEmTexto;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public List<contato> getLista(){
		
		List<contato> lista = new ArrayList<contato>();
		lista.add(new contato(1L, "joao"));
		lista.add(new contato(2L, "felipe"));
		
		return lista;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
    
}

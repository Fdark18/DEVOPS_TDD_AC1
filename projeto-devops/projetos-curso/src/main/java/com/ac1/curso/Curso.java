package com.ac1.curso;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Curso {
	private String nome;
	//outros atributos podem ser adicionados no futuro
	
	public Curso(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

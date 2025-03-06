package com.generation.blogpessoal.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity // indica nova tabela no banco de dados
@Table(name="tb_temas")// sem essa linha define o nome da tabela sem ela o Entity o Spring cria uma tabela com o nome da classe

public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull(message = "O Campo Descrição é obrigatório")
	private String descricao;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "tema",
			cascade = CascadeType.REMOVE) /// Se o tem for removido TODOS os posts relcionado a esse tema são apagados também
			
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem;

	public List<Postagem> getPostagem() {
		return postagem;
	}


	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
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
	
	
	

}

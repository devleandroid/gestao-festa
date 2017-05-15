package com.greathome.festa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Convidado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(generator = "increment") 
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	
	private String genero;
	
	private String nome;
	
	private Integer quantidadeAcompanhantes;
	
	private Integer contatoFixo;
	
	private Integer contatoCelular;
	
	private String email;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}
	
	public Integer getContatoFixo() {
		return contatoFixo;
	}
	
	public void setContatoFixo(Integer contatoFixo) {
		this.contatoFixo = contatoFixo;
	}
	
	public Integer getContatoCelular() {
		return contatoCelular;
	}
	
	public void setContatoCelular(Integer contatoCelular) {
		this.contatoCelular = contatoCelular;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contatoCelular == null) ? 0 : contatoCelular.hashCode());
		result = prime * result + ((contatoFixo == null) ? 0 : contatoFixo.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((quantidadeAcompanhantes == null) ? 0 : quantidadeAcompanhantes.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		if (contatoCelular == null) {
			if (other.contatoCelular != null)
				return false;
		} else if (!contatoCelular.equals(other.contatoCelular))
			return false;
		if (contatoFixo == null) {
			if (other.contatoFixo != null)
				return false;
		} else if (!contatoFixo.equals(other.contatoFixo))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (quantidadeAcompanhantes == null) {
			if (other.quantidadeAcompanhantes != null)
				return false;
		} else if (!quantidadeAcompanhantes.equals(other.quantidadeAcompanhantes))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Convidado [id=" + id + ", genero=" + genero + ", nome=" + nome + ", quantidadeAcompanhantes="
				+ quantidadeAcompanhantes + ", contatoFixo=" + contatoFixo + ", contatoCelular=" + contatoCelular
				+ ", email=" + email + "]";
	}	
}

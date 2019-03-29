package br.com.posestacio.agenda.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ContatoDto {

	private String nome;
	private String email;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataCadastro;
	private List<TelefoneDto> telefones;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<TelefoneDto> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneDto> telefones) {
		this.telefones = telefones;
	}

	public static class TelefoneDto {
		private Integer numero;
		private Integer ddd;
		
		public Integer getNumero() {
			return numero;
		}
		
		public void setNumero(Integer numero) {
			this.numero = numero;
		}
		
		public Integer getDdd() {
			return ddd;
		}
		
		public void setDdd(Integer ddd) {
			this.ddd = ddd;
		}
		
	}
	
}

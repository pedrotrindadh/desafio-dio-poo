package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	private LocalDate data;
	
	Conteudo conteudo;
	
	public Mentoria() {
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Conteudo getConteudo() {
		return conteudo;
	}
	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}
	
	@Override
	public Double calcularXp() {
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}
}

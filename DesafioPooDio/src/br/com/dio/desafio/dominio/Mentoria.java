package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public double calculaXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 40d;
	}

	@Override
	public String toString() {
		return "Mentoria:  Titulo= " + getTitulo()+ " / "
				        + "descrição = "+getDescricao()+ " /"
				        + "Data=" + data + " / XP obtido: ";
	}
}

package br.com.dio.desafio.dominio;


public class Curso extends Conteudo {
	
    private int cargaHoraria;

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	//Metodo abstrato herdado da classe Conteudo
	@Override
	public double calculaXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
		return " Curso: Titulo= " + getTitulo()+ " / "
				        + "descrição = "+getDescricao()+ " /"
				        + "Carga Horaria=" + cargaHoraria + " / XP obtido: " ;
	}

}

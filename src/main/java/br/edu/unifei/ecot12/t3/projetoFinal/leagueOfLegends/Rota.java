package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class Rota {

	private EnumRota nome;

	private Torre[] torres = new Torre[2];

	public EnumRota getNome() {
		return nome;
	}

	public void setNome(EnumRota nome) {
		this.nome = nome;
	}

	public Torre[] getTorres() {
		return torres;
	}

	public void setTorres(Torre[] torres) {
		this.torres = torres;
	}

}

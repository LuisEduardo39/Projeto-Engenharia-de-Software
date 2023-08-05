package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class Equipe {

	private EnumLado lado;

	private Invocador[] invocadores = new Invocador[5];

	public EnumLado getLado() {
		return lado;
	}

	public void setLado(EnumLado lado) {
		this.lado = lado;
	}

	public Invocador[] getInvocadores() {
		return invocadores;
	}

	public void setInvocadores(Invocador[] invocadores) {
		this.invocadores = invocadores;
	}

}

package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

import java.util.Stack;

public class Historico {

	private Stack<Ama> amas = new Stack<Ama>();
	private Invocador invocador;

	public void desfazer() {
		if ((!amas.isEmpty()) && (invocador != null)) {
			invocador.recuperaAma(amas.pop());
		}
	}

	public void adicionarAma() {
		if (invocador != null) {
			amas.add(invocador.novoAma());
		}
	}

	public Stack<Ama> getAmas() {
		return amas;
	}

	public void setAmas(Stack<Ama> amas) {
		this.amas = amas;
	}

	public Invocador getInvocador() {
		return invocador;
	}

	public void setInvocador(Invocador invocador) {
		this.invocador = invocador;
	}

}

package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	private boolean estaNaBase;

	private List<Item> itens = new ArrayList<Item>();

	public boolean isEstaNaBase() {
		return estaNaBase;
	}

	public void setEstaNaBase(boolean estaNaBase) {
		this.estaNaBase = estaNaBase;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}

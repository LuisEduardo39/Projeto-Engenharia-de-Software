package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

import java.util.ArrayList;
import java.util.List;

public class Nexus {

	private boolean destruido;
	private int vida;
	private int defesa;
	private boolean invuneravel;

	private List<Tropa> liberarTropa = new ArrayList<Tropa>();

	public boolean isDestruido() {
		return destruido;
	}

	public void setDestruido(boolean destruido) {
		this.destruido = destruido;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public boolean isInvuneravel() {
		return invuneravel;
	}

	public void setInvuneravel(boolean invuneravel) {
		this.invuneravel = invuneravel;
	}

	public List<Tropa> getLiberarTropa() {
		return liberarTropa;
	}

	public void setLiberarTropa(List<Tropa> liberarTropa) {
		this.liberarTropa = liberarTropa;
	}

}

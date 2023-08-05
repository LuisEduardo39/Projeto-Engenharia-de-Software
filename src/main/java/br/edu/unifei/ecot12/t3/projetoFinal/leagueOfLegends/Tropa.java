package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class Tropa {

	private int vida;
	private int dano;
	private int alcance;
	private int armadura;
	private int visao;
	private EnumTropa tipo;
	private int ouroDado;
	private int xpDado;

	private Inibidor i = new Inibidor();
	
	public boolean superTropa(Inibidor i) {
		if(i.isDestruido()) {
			return true;
		}
		return false;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public int getVisao() {
		return visao;
	}

	public void setVisao(int visao) {
		this.visao = visao;
	}

	public EnumTropa getTipo() {
		return tipo;
	}

	public void setTipo(EnumTropa tipo) {
		this.tipo = tipo;
	}

	public int getOuroDado() {
		return ouroDado;
	}

	public void setOuroDado(int ouroDado) {
		this.ouroDado = ouroDado;
	}

	public int getXpDado() {
		return xpDado;
	}

	public void setXpDado(int xpDado) {
		this.xpDado = xpDado;
	}

	public Inibidor getI() {
		return i;
	}

	public void setI(Inibidor i) {
		this.i = i;
	}

}

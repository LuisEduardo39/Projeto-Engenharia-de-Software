package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class Monstro {

	private boolean provocado;
	private int ouroDado;
	private int dano;
	private int armadura;
	private int alcamnce;
	private int xpDado;
	private EnumTipoMonstro tipo;
	private EnumMonstros nome;

	public boolean isProvocado() {
		return provocado;
	}

	public void setProvocado(boolean provocado) {
		this.provocado = provocado;
	}

	public int getOuroDado() {
		return ouroDado;
	}

	public void setOuroDado(int ouroDado) {
		this.ouroDado = ouroDado;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public int getAlcamnce() {
		return alcamnce;
	}

	public void setAlcamnce(int alcamnce) {
		this.alcamnce = alcamnce;
	}

	public int getXpDado() {
		return xpDado;
	}

	public void setXpDado(int xpDado) {
		this.xpDado = xpDado;
	}

	public EnumTipoMonstro getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipoMonstro tipo) {
		this.tipo = tipo;
	}

	public EnumMonstros getNome() {
		return nome;
	}

	public void setNome(EnumMonstros nome) {
		this.nome = nome;
	}

}

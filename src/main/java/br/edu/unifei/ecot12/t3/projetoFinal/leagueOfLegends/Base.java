package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class Base {

	private int estruturasdestruidas;

	private Torre[] torres = new Torre[5];
	private Inibidor[] inibidores = new Inibidor[3];
	private Nexus nexus = new Nexus();

	public int getEstruturasdestruidas() {
		return estruturasdestruidas;
	}

	public void setEstruturasdestruidas(int estruturasdestruidas) {
		this.estruturasdestruidas = estruturasdestruidas;
	}

	public Torre[] getTorres() {
		return torres;
	}

	public void setTorres(Torre[] torres) {
		this.torres = torres;
	}

	public Inibidor[] getInibidores() {
		return inibidores;
	}

	public void setInibidores(Inibidor[] inibidores) {
		this.inibidores = inibidores;
	}

	public Nexus getNexus() {
		return nexus;
	}

	public void setNexus(Nexus nexus) {
		this.nexus = nexus;
	}

}

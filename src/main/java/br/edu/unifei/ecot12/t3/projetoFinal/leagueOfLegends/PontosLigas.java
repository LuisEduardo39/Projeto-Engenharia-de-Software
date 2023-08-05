package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class PontosLigas {

	private int pdl;
	private float mmr;
	private EnumElo elo;
	// passo 1 - atributo estático reflexivo
	private static PontosLigas instancia = new PontosLigas();

	// passo 2 - construtor privado
	private PontosLigas() {
	}

	// passo 3 - método estátido que retorna atributo reflexivo
	public static PontosLigas getInstancia() {
		return instancia;
	}

	public int getPdl() {
		return pdl;
	}

	public void setPdl(int pdl) {
		this.pdl = pdl;
	}

	public float getMmr() {
		return mmr;
	}

	public void setMmr(float mmr) {
		this.mmr = mmr;
	}

	public EnumElo getElo() {
		return elo;
	}

	public void setElo(EnumElo elo) {
		this.elo = elo;
	}

}

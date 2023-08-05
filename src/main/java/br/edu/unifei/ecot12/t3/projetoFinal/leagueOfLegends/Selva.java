package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class Selva {
	
	private int numeroArbustros;
	private boolean nevoaBatalha;
	private boolean invasao;
	
	private Monstro[] monstros = new Monstro[16];

	public int getNumeroArbustros() {
		return numeroArbustros;
	}

	public void setNumeroArbustros(int numeroArbustros) {
		this.numeroArbustros = numeroArbustros;
	}

	public boolean isNevoaBatalha() {
		return nevoaBatalha;
	}

	public void setNevoaBatalha(boolean nevoaBatalha) {
		this.nevoaBatalha = nevoaBatalha;
	}

	public boolean isInvasao() {
		return invasao;
	}

	public void setInvasao(boolean invasao) {
		this.invasao = invasao;
	}

	public Monstro[] getMonstros() {
		return monstros;
	}

	public void setMonstros(Monstro[] monstros) {
		this.monstros = monstros;
	}

}

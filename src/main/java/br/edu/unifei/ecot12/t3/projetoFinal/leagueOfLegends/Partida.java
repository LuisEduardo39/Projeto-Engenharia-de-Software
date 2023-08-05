package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class Partida {

	private int tempoFila;
	private EnumPartida modoJogo;
	private boolean duo;

	private SummonersRift mapa = new SummonersRift();

	private Equipe[] equipes = new Equipe[2];

	public int getTempoFila() {
		return tempoFila;
	}

	public void setTempoFila(int tempoFila) {
		this.tempoFila = tempoFila;
	}

	public EnumPartida getModoJogo() {
		return modoJogo;
	}

	public void setModoJogo(EnumPartida modoJogo) {
		this.modoJogo = modoJogo;
	}

	public boolean isDuo() {
		return duo;
	}

	public void setDuo(boolean duo) {
		this.duo = duo;
	}

	public SummonersRift getMapa() {
		return mapa;
	}

	public void setMapa(SummonersRift mapa) {
		this.mapa = mapa;
	}

	public Equipe[] getEquipes() {
		return equipes;
	}

	public void setEquipes(Equipe[] equipes) {
		this.equipes = equipes;
	}

}

package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class Invocador {

	private String nome;
	private int idade;
	private int qi;
	private double ama;

	private Runa runa = new Runa();
	private FeiticoInvocador[] feiticos = new FeiticoInvocador[2];
	private Campeao campeao = new Campeao();

	public Ama novoAma() {
		Ama a = new Ama();
		a.setAma(this.ama);
		return a;
	}

	public void recuperaAma(Ama a) {
		this.ama = a.getAma();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getQi() {
		return qi;
	}

	public void setQi(int qi) {
		this.qi = qi;
	}

	public Runa getRuna() {
		return runa;
	}

	public void setRuna(Runa runa) {
		this.runa = runa;
	}

	public FeiticoInvocador[] getFeiticos() {
		return feiticos;
	}

	public void setFeiticos(FeiticoInvocador[] feiticos) {
		this.feiticos = feiticos;
	}

	public Campeao getCampeao() {
		return campeao;
	}

	public void setCampeao(Campeao campeao) {
		this.campeao = campeao;
	}

	public double getAma() {
		return ama;
	}

	public void setAma(double ama) {
		this.ama = ama;
	}

}

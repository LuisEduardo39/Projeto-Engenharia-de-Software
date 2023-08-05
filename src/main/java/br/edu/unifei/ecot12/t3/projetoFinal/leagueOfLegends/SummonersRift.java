package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class SummonersRift {

	private String localizacao;
	private float energiaMagica;

	private Loja[] lojas = new Loja[2];
	private Base[] bases = new Base[2];
	private Rota[] rotas = new Rota[3];
	private Selva selva = new Selva();

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public float getEnergiaMagica() {
		return energiaMagica;
	}

	public void setEnergiaMagica(float energiaMagica) {
		this.energiaMagica = energiaMagica;
	}

	public Loja[] getLojas() {
		return lojas;
	}

	public void setLojas(Loja[] lojas) {
		this.lojas = lojas;
	}

	public Base[] getBases() {
		return bases;
	}

	public void setBases(Base[] bases) {
		this.bases = bases;
	}

	public Rota[] getRotas() {
		return rotas;
	}

	public void setRotas(Rota[] rotas) {
		this.rotas = rotas;
	}

	public Selva getSelva() {
		return selva;
	}

	public void setSelva(Selva selva) {
		this.selva = selva;
	}

}

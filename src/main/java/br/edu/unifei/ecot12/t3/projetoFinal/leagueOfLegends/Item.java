package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class Item {

	private String descricao;
	private int preco;
	private String nome;
	private EnumItem categoria;
	private EnumAtributos atributos;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnumItem getCategoria() {
		return categoria;
	}

	public void setCategoria(EnumItem categoria) {
		this.categoria = categoria;
	}

	public EnumAtributos getAtributos() {
		return atributos;
	}

	public void setAtributos(EnumAtributos atributos) {
		this.atributos = atributos;
	}

}

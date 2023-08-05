package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

import java.util.ArrayList;
import java.util.List;

public class Campeao {

	private String funcao;
	private String caracteristica;
	private EnumClasse classe;
	private String nome;
	private int farm;
	private int nivel;
	private int pontosHabilidade;
	private String kda;
	private EnumAtributos atributosBase;
	private int estoqueOuro;
	private double barraXp;

	private List<Loja> comprar = new ArrayList<Loja>();
	private Item[] itens = new Item[6];
	private Habilidades[] habilidades = new Habilidades[5];

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public EnumClasse getClasse() {
		return classe;
	}

	public void setClasse(EnumClasse classe) {
		this.classe = classe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFarm() {
		return farm;
	}

	public void setFarm(int farm) {
		this.farm = farm;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPontosHabilidade() {
		return pontosHabilidade;
	}

	public void setPontosHabilidade(int pontosHabilidade) {
		this.pontosHabilidade = pontosHabilidade;
	}

	public String getKda() {
		return kda;
	}

	public void setKda(String kda) {
		this.kda = kda;
	}

	public EnumAtributos getAtributosBase() {
		return atributosBase;
	}

	public void setAtributosBase(EnumAtributos atributosBase) {
		this.atributosBase = atributosBase;
	}

	public int getEstoqueOuro() {
		return estoqueOuro;
	}

	public void setEstoqueOuro(int estoqueOuro) {
		this.estoqueOuro = estoqueOuro;
	}

	public List<Loja> getComprar() {
		return comprar;
	}

	public void setComprar(List<Loja> comprar) {
		this.comprar = comprar;
	}

	public Item[] getItens() {
		return itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}

	public Habilidades[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Habilidades[] habilidades) {
		this.habilidades = habilidades;
	}

	public double getBarraXp() {
		return barraXp;
	}

	public void setBarraXp(double barraXp) {
		this.barraXp = barraXp;
	}

}

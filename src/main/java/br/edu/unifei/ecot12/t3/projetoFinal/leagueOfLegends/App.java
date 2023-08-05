package br.edu.unifei.ecot12.t3.projetoFinal.leagueOfLegends;

public class App {

	public static void main(String[] args) {

		Partida p = new Partida();
		p.setTempoFila(5);
		p.setModoJogo(EnumPartida.NORMAL);
		p.setDuo(false);

		Equipe e = new Equipe();
		e.setLado(EnumLado.AZUL);

		System.out.println("Padrao Objeto Unico");
		PontosLigas p1 = PontosLigas.getInstancia();
		PontosLigas p2 = PontosLigas.getInstancia();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1 == p2);

		System.out.println("\nPadrao Recordador");
		int cont = 0;
		Historico h = new Historico();
		h.setInvocador(new Invocador());
		h.getInvocador().setNome("Luis");
		h.getInvocador().setIdade(22);
		h.getInvocador().setAma(0); // KDA = 0/0/0

		// Calculo do ama é a soma do numero de kill com o
		// numero de assistencia e dividido pelo numero de morte (se for maior que 1)

		// jogador pegou uma kill
		// calcula novo ama

		h.adicionarAma();
		h.getInvocador().setAma(1);// KDA = 1/0/0
		cont++;

		// jogador pegou uma kill
		// calcula novo ama

		h.adicionarAma();
		h.getInvocador().setAma(2);// KDA = 2/0/0
		cont++;

		// jogador pegou assistencia
		// calcula novo ama

		h.adicionarAma();
		h.getInvocador().setAma(3);// KDA = 2/0/1
		cont++;

		// jogador morreu!
		// calcula novo ama

		h.adicionarAma();
		h.getInvocador().setAma(3);// KDA = 2/1/1
		cont++;

		// jogador morreu!
		// calcula novo ama

		h.adicionarAma();
		h.getInvocador().setAma(1.5);// KDA = 2/2/1
		cont++;

		// jogador pegou assistencia
		// calcula novo ama

		h.adicionarAma();
		h.getInvocador().setAma(2);// KDA = 2/2/2
		cont++;

		System.out.println("Historico de ama do jogador durante a partida:");
		System.out.println(h.getInvocador().getAma());
		for (int i = 0; i < cont; i++) {
			h.desfazer();
			System.out.println(h.getInvocador().getAma());
		}

		Runa r = new Runa();
		r.setCaminhoPrimario("Precisao");
		r.setDescricao("ataques aprimorados e danos contínuos");
		r.setCaminhoSecundario("Determinacao");

		FeiticoInvocador f = new FeiticoInvocador();
		f.setNome(EnumFeitico.BARREIRA);
		f.setDescricao("Protege seu campeão contra dano por 2 segundos.");
		f.setTempoRecarga(3);

		Campeao c = new Campeao();
		c.setFuncao("Carregador");
		c.setCaracteristica("Ficar forte, e ganhar o jogo");
		c.setClasse(EnumClasse.ATIRADOR);
		c.setNome("Ashe");
		c.setFarm(100);
		c.setNivel(10);
		c.setPontosHabilidade(10);
		c.setKda("2/2/2");
		c.setAtributosBase(EnumAtributos.DANO_ACERTO_CRITICO);
		c.setEstoqueOuro(5000);
		c.setBarraXp(0.8);

		Habilidades ha = new Habilidades();
		ha.setNome("Flecha de Cristal Encantada");
		ha.setDescricao(
				"Ashe dispara um projetil dde gelo em linha reta. Se a flecha colidir com um Campeao inimigo,ela causa dano e o atordoa.");
		ha.setCustoMana(100);
		ha.setTempoRecaga(74.07);

		Loja l = new Loja();
		l.setEstaNaBase(false);

		Item i = new Item();
		i.setAtributos(EnumAtributos.ROUBO_VIDA);
		i.setNome("Sedenta por Sangue");
		i.setCategoria(EnumItem.ATAQUE);
		i.setDescricao("A vida excedente fica armazenada como escudo");
		i.setPreco(3400);

		SummonersRift sr = new SummonersRift();
		sr.setLocalizacao("floresta entre Freljord e as Montanhas Ironspine");
		sr.setEnergiaMagica(150);

		Selva s = new Selva();
		s.setNumeroArbustros(20);
		s.setNevoaBatalha(true);
		s.setInvasao(true);

		Monstro m = new Monstro();
		m.setAlcamnce(350);
		m.setArmadura(21);
		m.setDano(230);
		m.setNome(EnumMonstros.DRAGAO);
		m.setOuroDado(165);
		m.setProvocado(false);
		m.setTipo(EnumTipoMonstro.EPICOS);
		m.setXpDado(300);

		Rota ra = new Rota();
		ra.setNome(EnumRota.BOT);

		Torre t = new Torre();
		t.setAlcance(1095);
		t.setDano(100);
		t.setDefesa(100);
		t.setOuroDado(100);
		t.setVida(4000);
		t.setVisao(775);
		t.setXpDado(50);

		Base b = new Base();
		b.setEstruturasdestruidas(3);

		Inibidor in = new Inibidor();
		in.setVida(400);
		in.setDefesa(20);
		in.setDestruido(false);

		Tropa tr = new Tropa();
		tr.setAlcance(550);
		tr.setArmadura(10);
		tr.setDano(20);
		tr.setOuroDado(30);
		tr.setTipo(EnumTropa.MAGOS);
		tr.setVida(100);
		tr.setVisao(400);
		tr.setXpDado(50);

		Nexus n = new Nexus();
		n.setDefesa(20);
		n.setDestruido(false);
		n.setInvuneravel(true);
		n.setVida(5500);

	}

}

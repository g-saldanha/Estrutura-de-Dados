public class TabelaListaInvertidaCadBibliografico {
//	Atributos da Classe
	private String[][] cadastrosBibliograficos;
	private No primeiro;
	private No ultimo;
	private int ultimaPosicao;
	private DiretorioEditora editora;
	private DiretorioAreaTematica areaTematica;
//	Fim dos atributos

//	Método construtor que vai formar a tabela
	public TabelaListaInvertidaCadBibliografico() {
		this.cadastrosBibliograficos = new String[50][7];
		this.editora = new DiretorioEditora();
		areaTematica = new DiretorioAreaTematica();

//		Aqui o construtor vai popular a tabela com o cabeçalho dos itens, cada coluna com o seu nome no cabeçalho
		cadastrosBibliograficos[0][0] = StringsUsadas.POSICAO;
		cadastrosBibliograficos[0][1] = StringsUsadas.CODIGO;
		cadastrosBibliograficos[0][2] = StringsUsadas.TITULO;
		cadastrosBibliograficos[0][3] = StringsUsadas.AUTOR;
		cadastrosBibliograficos[0][4] = StringsUsadas.EDITORA;
		cadastrosBibliograficos[0][5] = StringsUsadas.PUBLICACAO;
		cadastrosBibliograficos[0][6] = StringsUsadas.AREA_TEMATICA;

//		inicia a contador de posição
		ultimaPosicao = 0;
	}

//	Método de Busca simples conforme pedido, vai receber o parâmetro coluna e palavra a ser buscada e vai retornar as ocorrências da determinada busca
	public void buscaSimples(String colunaDeDados, String valorParaBusca){
		switch (colunaDeDados){
			case StringsUsadas.AREA_TEMATICA:
				buscaEmDiretotio(valorParaBusca);
				break;
			case StringsUsadas.EDITORA:	
				break;
			default: 
				
				break;
		}   
	}

	private void buscaEmDiretotio(String valorParaBusca) {
	}

	//	Método que vai incluir dados, ela vai pegar a última posição e incrementar, em seguida irá usar os parâmetros para inserir no array da tabela os dados.
	public void incluirDado(int codigo, String titulo, String autor, String editora, int publicacao, String areaTematica) {
		ultimaPosicao++;
		cadastrosBibliograficos[ultimaPosicao][0] = "" + ultimaPosicao;
		cadastrosBibliograficos[ultimaPosicao][1] = "" + codigo;
		cadastrosBibliograficos[ultimaPosicao][2] = titulo;
		cadastrosBibliograficos[ultimaPosicao][3] = autor;
		cadastrosBibliograficos[ultimaPosicao][4] = editora;
		cadastrosBibliograficos[ultimaPosicao][5] = "" + publicacao;
		cadastrosBibliograficos[ultimaPosicao][6] = areaTematica;
		this.editora.incluirEditora(editora, ultimaPosicao, codigo);
		this.areaTematica.incluirAreaTematica(areaTematica, ultimaPosicao, codigo);
	}
	
	public void retornaValores(TabelaListaInvertidaCadBibliografico tabelinha){
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Só Boa Leitura");
		System.out.println("-----------------------------------------------------------------------");
		NoDiretorio no = (NoDiretorio) tabelinha.getEditora().getDiretorio()[0][1];
		int[] boas = new int[20];
		int i = 0;
		while (no != null){
			boas[i] = no.getPosicao();
			no = no.getSucessor();
			i++;
		}

		for (int j = 0; j < i; j++) {
			for (int k = 0; k < 7; k++) {
				System.out.print(" | " + tabelinha.getCadastrosBibliograficos()[boas[j]][k]);
			}
			System.out.println();
		}
	}



// Getters e Setters
	public String[][] getCadastrosBibliograficos() {
		return cadastrosBibliograficos;
	}

	public void setCadastrosBibliograficos(String[][] cadastrosBibliograficos) {
		this.cadastrosBibliograficos = cadastrosBibliograficos;
	}

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

	public No getUltimo() {
		return ultimo;
	}

	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

	public int getUltimaPosicao() {
		return ultimaPosicao;
	}

	public void setUltimaPosicao(int ultimaPosicao) {
		this.ultimaPosicao = ultimaPosicao;
	}

	public DiretorioEditora getEditora() {
		return editora;
	}

	public void setEditora(DiretorioEditora editora) {
		this.editora = editora;
	}

	public DiretorioAreaTematica getAreaTematica() {
		return areaTematica;
	}

	public void setAreaTematica(DiretorioAreaTematica areaTematica) {
		this.areaTematica = areaTematica;
	}
}

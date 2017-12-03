public class TabelaListaInvertidaCadBibliografico {
	private String[][] cadastrosBibliograficos;
	private No primeiro;
	private No ultimo;
	private int ultimaPosicao;

//	Classe construtora que vai formar a tabela
	public TabelaListaInvertidaCadBibliografico() {
		this.cadastrosBibliograficos = new String[50][7];
		ultimaPosicao = 1;

//		Aqui o construtor vai popular a tabela com o cabeçalho dos itens, cada coluna com o seu nome no cabeçalho
		cadastrosBibliograficos[0][0] = StringsUsadas.POSICAO;
		cadastrosBibliograficos[0][1] = StringsUsadas.CODIGO;
		cadastrosBibliograficos[0][2] = StringsUsadas.TITULO;
		cadastrosBibliograficos[0][3] = StringsUsadas.AUTOR;
		cadastrosBibliograficos[0][4] = StringsUsadas.EDITORA;
		cadastrosBibliograficos[0][5] = StringsUsadas.PUBLICACAO;
		cadastrosBibliograficos[0][6] = StringsUsadas.AREA_TEMATICA;

//		inicia a contador de posição
		ultimaPosicao = 1;
	}




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
}

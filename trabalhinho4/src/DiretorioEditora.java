public class DiretorioEditora {
	public Object[][] diretorio;
	private int ultimaPosicao;

	public DiretorioEditora() {
		diretorio = new Object[20][2];
		ultimaPosicao = 0;
	}

//Classe que inclui nesta lista invertida, posições de índices
	public void incluirEditora(String editora, int ultimaPosicao, int codigo) {
//		Chave para adicionar ou não nova editora
		boolean haEditora = false;
//		Estrutura de laço que percorre todas as linhas do diretório editora, até encontra um nome de editora igual
		for (int i = 0; i <= this.ultimaPosicao; i++) {
//			Se encontrar a editora, vai percorrer todos os dados que estão contidos nela até achar o ultimo nó e inserir o sucessor que vai ser incluído nele
			if (getDiretorio()[i][0] != null && getDiretorio()[i][0].equals(editora)) {
				haEditora = true;
				NoDiretorio dado = (NoDiretorio) getDiretorio()[i][1];
				while (dado.getSucessor() != null) {
					dado = dado.getSucessor();
				}
				dado.setSucessor(new NoDiretorio(codigo,ultimaPosicao));
			}
		}
//      Se não encontrar a editora procurada ou se não houver editora no diretório, ele adiciona
		if (!haEditora || getDiretorio()[0][0] == null) {
			getDiretorio()[this.ultimaPosicao][0] = editora;
			getDiretorio()[this.ultimaPosicao][1] = new NoDiretorio(codigo, ultimaPosicao);
//			aumenta o contador de posições de linhas de editoras
			this.ultimaPosicao++;
		}

	}

	public Object[][] getDiretorio() {
		return diretorio;
	}

	public void setDiretorio(Object[][] diretorio) {
		this.diretorio = diretorio;
	}

	public int getUltimaPosicao() {
		return ultimaPosicao;
	}

	public void setUltimaPosicao(int ultimaPosicao) {
		this.ultimaPosicao = ultimaPosicao;
	}



}

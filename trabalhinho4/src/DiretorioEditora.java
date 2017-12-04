public class DiretorioEditora {
	public Object[][] diretorio;
	private int ultimaPosicao;

	public DiretorioEditora() {
		diretorio = new Object[20][2];
		ultimaPosicao = 0;
	}

//Classe que inclui nesta lista invertida, posições de índices
	public void incluirEditora(String editora, int ultimaPosicao, int codigo) {
		boolean haEditora = false;
		for (int i = 0; i <= this.ultimaPosicao; i++) {
			if (getDiretorio()[i][0] != null && getDiretorio()[i][0].equals(editora)) {
				haEditora = true;
				NoDiretorio dado = (NoDiretorio) getDiretorio()[i][1];
				while (dado.getSucessor() != null) {
					dado = dado.getSucessor();
				}
				dado.setSucessor(new NoDiretorio(codigo,ultimaPosicao));
			}
		}

		if (!haEditora || getDiretorio()[0][0] == null) {
			getDiretorio()[this.ultimaPosicao][0] = editora;
			getDiretorio()[this.ultimaPosicao][1] = new NoDiretorio(codigo, ultimaPosicao);
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

public class DiretorioEditora {
	public Object[][] diretorio;
	private int ultimaPosicao;

	public DiretorioEditora() {
		diretorio = new Object[20][2];
	}

	public void incluirEditora(String editora, No itemBibiografico) {
		for (int i = 0; i < ultimaPosicao; i++) {
			if (getDiretorio()[i][0].equals(editora)){
				No dado = (No) getDiretorio()[i][1];
				while (dado.getSucessor() != null){
					dado = dado.getSucessor(); 
				}
				dado.setSucessor(dado);
			} else {
				ultimaPosicao++;
//				getDiretorio()[ultimaPosicao][0] = editora;
//				getDiretorio()[ultimaPosicao][1] = itemBibiografico;
			}
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

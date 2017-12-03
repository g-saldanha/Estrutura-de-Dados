public class NoDiretorio {
//	 Nó dos diretórios que contém o código e sua posição
	private int codigo;
	private int posicao;
	private NoDiretorio sucessor;

	public NoDiretorio(int codigo, int posicao) {
		this.codigo = codigo;
		this.posicao = posicao;
		sucessor = null;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public NoDiretorio getSucessor() {
		return sucessor;
	}

	public void setSucessor(NoDiretorio sucessor) {
		this.sucessor = sucessor;
	}
}

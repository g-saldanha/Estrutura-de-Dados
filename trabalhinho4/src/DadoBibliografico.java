public class DadoBibliografico {
//	Atributos dos dados Bibliográficos
	private int posicao;
	private int codigo;
	private String titulo;
	private String autor;
	private int editora;
	private int publicacao;
	private int areaTematica;
//	Fim dos atributos


//  Classe construtora, onde toda vez que um novo objeto DadoBibliografico for instanciado, haverá uma posição que ele possuirá na tabela
	public DadoBibliografico(int posicao) {
		this.posicao = posicao;
	}

//	Getter e Setters
	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEditora() {
		return editora;
	}

	public void setEditora(int editora) {
		this.editora = editora;
	}

	public int getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(int publicacao) {
		this.publicacao = publicacao;
	}

	public int getAreaTematica() {
		return areaTematica;
	}

	public void setAreaTematica(int areaTematica) {
		this.areaTematica = areaTematica;
	}
}

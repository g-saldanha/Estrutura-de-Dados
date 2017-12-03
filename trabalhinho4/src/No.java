public class No {
//	Atributos, uma lista encadeada dinâmica simples que vai possuir o Objeto Dado Bibliográfico, como tupla e a referência do seu nó sucessor na tabela e nos diretórios
	private DadoBibliografico dadoBibliografico;
	private No sucessor;

//	Classe construtora, que ao ser instanciada vai passar o dado bibliográfico como parâmetro para alguma tabela ou diretório
	public No(DadoBibliografico dadoBibliografico) {
		this.dadoBibliografico = dadoBibliografico;
		sucessor = null;
	}

//	Getters e Setters

	public DadoBibliografico getDadoBibliografico() {
		return dadoBibliografico;
	}

	public void setDadoBibliografico(DadoBibliografico dadoBibliografico) {
		this.dadoBibliografico = dadoBibliografico;
	}

	public No getSucessor() {
		return sucessor;
	}

	public void setSucessor(No sucessor) {
		this.sucessor = sucessor;
	}
}

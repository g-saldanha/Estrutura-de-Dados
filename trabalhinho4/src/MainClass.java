public class MainClass {
	public static void main(String[] args){
		TabelaListaInvertidaCadBibliografico tabelinha = new TabelaListaInvertidaCadBibliografico();
		tabelinha.incluirDado(12421, "Corrigir Exercícios", "Paulo", "Boa Leitura", 1990, "didática");
		tabelinha.incluirDado(72433,"Alimentação Verde","Jonas","Grande", 2004, "saúde");
		tabelinha.incluirDado(92533,"Pães Caseiros","Bia","Boa Leitura",2002,"economia doméstica");
		tabelinha.incluirDado(24324,"Bons Exemplos","Raul","Aventura",1993,"didática");
		tabelinha.incluirDado(32888,"Explicações Claras","Rita","Boa Leitura",1995,"didática");
		tabelinha.incluirDado(99001,"Gastar, Poupar, Viver...","Jonas","Maior",1995,"saúde");
		tabelinha.incluirDado(81443,"Pesquisa de Preços","Ana","Boa Leitura",2004,"economia doméstica");
		tabelinha.incluirDado(12120,"Exercícios Regulares","Rita","Super",2004,"saúde");
		tabelinha.incluirDado(45544,"Vida Social","Ana","Hiper",2002,"saúde");
		tabelinha.incluirDado(93271,"Zeca Tatu","Bia","Aventura",2004,"infantil");
		tabelinha.incluirDado(12413,"Tilápias para Corte","Cleo","Boa Leitura",1990,"psicultura");
		tabelinha.incluirDado(66318,"Saúde Mental","Rita","Boa Leitura",1991,"saúde");

		DiretorioEditora editora = tabelinha.getEditora();

		for (int j = 0; j <= tabelinha.getUltimaPosicao(); j++) {
			for (int i = 0; i < 7; i++) {
				System.out.print("|  " + tabelinha.getCadastrosBibliograficos()[j][i] + "  ");
				if (i == 6){
					System.out.print("|");
				}
			}
			System.out.println();
		}


		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Diretório Editora");
		System.out.println("-----------------------------------------------------------------------");
		for (int i = 0; i < editora.getUltimaPosicao() ; i++) {
			System.out.print(editora.getDiretorio()[i][0] + " | ");
			NoDiretorio dado = (NoDiretorio) editora.getDiretorio()[i][1];
			System.out.print( + dado.getCodigo() + "|->");
			while (dado.getSucessor() != null){
				System.out.print("|" + dado.getSucessor().getCodigo() + "|->");
				dado = dado.getSucessor();
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------");

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
				System.out.print(tabelinha.getCadastrosBibliograficos()[boas[j]][k]);
			}
			System.out.println();
		}
	}



}

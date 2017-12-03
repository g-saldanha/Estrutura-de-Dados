public class MainClass {
	public static void main(String[] args){
		TabelaListaInvertidaCadBibliografico tabelinha = new TabelaListaInvertidaCadBibliografico();
		tabelinha.incluirDado(12421, "Corrigir Exercícios", "Paulo", "Boa Leitura", 1990, "didática");

		DiretorioEditora editora = new DiretorioEditora();

		for (int j = 0; j <= tabelinha.getUltimaPosicao(); j++) {
			for (int i = 0; i < 7; i++) {
				System.out.print("|  " + tabelinha.getCadastrosBibliograficos()[j][i] + "  ");
				if (i == 6){
					System.out.print("|");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < editora.getUltimaPosicao() ; i++) {
			System.out.print(editora.getDiretorio()[i][0] + " | ");
			NoDiretorio dado = (NoDiretorio) editora.getDiretorio()[i][1];
			while (dado.getSucessor != null){
				System.out.print("|" + dado.getCodigo() + "|->");
			}
		}
	}
}

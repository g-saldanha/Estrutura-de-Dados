public class MainClass {
	public static void main(String[] args){
		TabelaListaInvertidaCadBibliografico tabelinha = new TabelaListaInvertidaCadBibliografico();

		for (int i = 0; i < 7; i++) {
			System.out.print("|  " + tabelinha.getCadastrosBibliograficos()[0][i] + "  ");
			if (i == 6){
				System.out.print("|");
			}
		}
	}
}

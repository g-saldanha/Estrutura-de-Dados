public class ClasseInstanciadora {
    public static void main(String args[]){
        ListaDuplamenteEncadeada listaDuplamenteEncadeada = new ListaDuplamenteEncadeada();
//        listaDuplamenteEncadeada.setAtual(listaDuplamenteEncadeada.getPrimeiro());
        listaDuplamenteEncadeada.inserirDado(new Dado("dado"));
        listaDuplamenteEncadeada.setPrimeiro(listaDuplamenteEncadeada.getAtual());
        listaDuplamenteEncadeada.inserirAposAtual(new Dado("dado2"));
        listaDuplamenteEncadeada.inserirAntesDoAtual(new Dado("dado3"));
        listaDuplamenteEncadeada.avancarKPassos(1);
        listaDuplamenteEncadeada.inserirAposAtual(new Dado("dadoDepoisDoAvanço"));
        System.out.println(listaDuplamenteEncadeada.buscar("dado5"));

        No imprimir = listaDuplamenteEncadeada.getPrimeiro();
        int i = 1;
        while (i <= listaDuplamenteEncadeada.getQuantidade()) {
            System.out.println(imprimir.getAntecessor().getDado().getDado()+"|"+imprimir.getDado().getDado()+"|"+imprimir.getSucessor().getDado().getDado());
            if(imprimir.getSucessor() != null) imprimir = imprimir.getSucessor();
            i++;
        }
        System.out.println("");
        i=1;
        while (i <= listaDuplamenteEncadeada.getQuantidade()){
            System.out.print(imprimir.getDado().getDado()+"|");
            imprimir = imprimir.getSucessor();
            i++;
        }
        System.out.println("\n"+listaDuplamenteEncadeada.getAtual().getDado().getDado());
        System.out.println("\n"+listaDuplamenteEncadeada.getPrimeiro().getDado().getDado());
    }

}

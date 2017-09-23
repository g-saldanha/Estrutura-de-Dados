public class ClasseInstanciadora {
    public static void main(String args[]){
        ListaDuplamenteEncadeada listaDuplamenteEncadeada = new ListaDuplamenteEncadeada();
//        listaDuplamenteEncadeada.setAtual(listaDuplamenteEncadeada.getPrimeiro());
        listaDuplamenteEncadeada.inserirDado(new Dado("dado2"));
        listaDuplamenteEncadeada.setPrimeiro(listaDuplamenteEncadeada.getAtual());
        listaDuplamenteEncadeada.inserirAposAtual(new Dado("dado"));
        listaDuplamenteEncadeada.inserirAntesDoAtual(new Dado("dado3"));
        listaDuplamenteEncadeada.avancarKPassos(1);
//        listaDuplamenteEncadeada.inserirAposAtual(new Dado("dadoDepoisDoAvanço"));
//       listaDuplamenteEncadeada.buscar(listaDuplamenteEncadeada.getPrimeiro().getDado());

        No imprimir = listaDuplamenteEncadeada.getPrimeiro();
        int i = 0;
        while (i <= listaDuplamenteEncadeada.getQuantidade()) {
            System.out.println(imprimir.getDado().getDado());
            if(imprimir.getSucessor() != null) imprimir = imprimir.getSucessor();
            i++;
        }
        System.out.println("\n"+listaDuplamenteEncadeada.getAtual().getDado().getDado());
        System.out.println("\n"+listaDuplamenteEncadeada.getPrimeiro().getDado().getDado());
    }

}

public class ClasseInstanciadora {
    public static void main(String args[]){
        ListaDuplamenteEncadeada listaDuplamenteEncadeada = new ListaDuplamenteEncadeada();
        listaDuplamenteEncadeada.setPrimeiro(new No(new Dado("dado")));
        listaDuplamenteEncadeada.setAtual(listaDuplamenteEncadeada.getPrimeiro());
        listaDuplamenteEncadeada.inserirDado(new Dado("dado2"));
        listaDuplamenteEncadeada.inserirDado(new Dado("dado3"));
        listaDuplamenteEncadeada.avancarKPassos(1);
//        listaDuplamenteEncadeada.inserirAposAtual(new Dado("dadoDepoisDoAvanço"));
       listaDuplamenteEncadeada.buscar(listaDuplamenteEncadeada.getPrimeiro().getDado());

        No imprimir = listaDuplamenteEncadeada.getPrimeiro();
        int i = 0;
        while (i <= listaDuplamenteEncadeada.getQuantidade()) {
            System.out.println(imprimir.getDado().getDado());
            i++;
        }

    }

}

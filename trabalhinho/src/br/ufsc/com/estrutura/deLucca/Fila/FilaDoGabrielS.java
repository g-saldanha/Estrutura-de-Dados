package br.ufsc.com.estrutura.deLucca.Fila;

public class FilaDoGabrielS {
    private Nodo primeiro;
    private Nodo ultimo;
    private int quantidade;

    public FilaDoGabrielS() {
        this.primeiro = null;
        this.ultimo = null;
        this.quantidade = 0;
    }

    public Nodo getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Nodo primeiro) {
        this.primeiro = primeiro;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean ehVazia(){
        return (this.primeiro == null);
    }

    public void ínsereInicio(int numero){
        Nodo novoNodo = new Nodo(new Numero(numero));
        if (ehVazia()){
            setUltimo(novoNodo);
        }
        novoNodo.setProximo(getPrimeiro());
        setPrimeiro(novoNodo);
        setQuantidade(getQuantidade() + 1);
    }

    public void insereFinal(int numero){
        Nodo novoNodo = new Nodo(new Numero(numero));
        if (ehVazia()){
            setUltimo(novoNodo);
        }
        getUltimo().setProximo(novoNodo);
        setUltimo(novoNodo);
        setQuantidade(getQuantidade()+1);
    }

    public void insereNaPosicao(int posicao, int numero){
        if (posicao <= getQuantidade() && posicao > 0){
            int contador = 1;
            Nodo nodoProcurado = getPrimeiro();
            while (contador < posicao) {
                nodoProcurado = nodoProcurado.getProximo();
                contador++;
            }
            nodoProcurado.getNumero().setNumero(numero);
            setQuantidade(getQuantidade()+1);
        } else {
            System.out.println("Digite o numero correto");
        }
    }

    public void insereDepoisDe(int referencia, int numero){
//        if (referencia > getQuantidade() && referencia < 0){
//            System.out.println("Digite uma referencia");
//        }
//        else

            Nodo nodoProcurado = getPrimeiro();
            while (nodoProcurado.getNumero().getNumero() != referencia) {
                nodoProcurado = nodoProcurado.getProximo();
            }
            if (nodoProcurado.equals(null)){
                System.out.println("Não Encontrei seu numero");
            } else {
                Nodo nodoNovo = new Nodo(new Numero(numero));
                nodoNovo.setProximo(nodoProcurado.getProximo());
                nodoProcurado.setProximo(nodoNovo);
                setQuantidade(getQuantidade() +1);
            }

//        }
    }

    public void insereAntesDe(int posicao, int numero){
        if (posicao > getQuantidade() && posicao < 0){
            System.out.println("Digite a posição correta");
        } else {
            Nodo novoNodo = new Nodo(new Numero(numero));
            int contador = 1;
            if (posicao == 1) {
                ínsereInicio(numero);
            } else {
                Nodo nodoProcurado = getPrimeiro();
                while (contador < posicao - 1) {
                    nodoProcurado = nodoProcurado.getProximo();
                    contador++;
                }
                novoNodo.setProximo(nodoProcurado.getProximo());
                nodoProcurado.setProximo(novoNodo);
                setQuantidade(getQuantidade() + 1);
            }
        }
    }

    public void removeDaPosicao(int posicao){
        if (posicao > getQuantidade() && posicao < 0){
            System.out.println("Digite a posição correta");
        } else {
            int contador = 1;
            if (posicao == 1 && getQuantidade() > 0){
                setPrimeiro(getPrimeiro().getProximo());
            }
            Nodo nodoProcurado = getPrimeiro();
            while (contador < posicao -1){
                nodoProcurado = nodoProcurado.getProximo();
                contador++;
            }
            nodoProcurado.setProximo(null);
            if (posicao == getQuantidade()){
                setUltimo(nodoProcurado);
            }
            quantidade--;

        }

    }

}


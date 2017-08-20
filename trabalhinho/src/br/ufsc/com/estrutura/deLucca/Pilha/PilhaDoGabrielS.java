package br.ufsc.com.estrutura.deLucca.Pilha;

public class PilhaDoGabrielS {

    private Nodo primeiro;
    private Nodo ultimo;
    private int quantidade;

    public PilhaDoGabrielS() {
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
//        if (quantidade != 0) return false;
        return (this.getPrimeiro() == null);
    }

    public void push(int numero){
        Nodo novoNodo = new Nodo(new Numero(numero));
        if(this.ehVazia()){
            this.setUltimo(novoNodo);
        }
        novoNodo.setProximo(this.getPrimeiro());
        this.setPrimeiro(novoNodo);
        this.setQuantidade(getQuantidade() + 1);
    }

    public boolean pop(){
        if (this.primeiro != null){
            Nodo proximoDaPilha = getPrimeiro().getProximo();
            primeiro = proximoDaPilha;
        }
        return false;
    }
}

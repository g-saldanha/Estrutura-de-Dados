package br.ufsc.com.estrutura.deLucca.Fila;

public class Nodo {
    private Numero numero;
    private Nodo proximo;

    public Nodo(Numero numero) {
        this.numero = numero;
        this.proximo = null;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}

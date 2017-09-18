public class No {
    private No antecessor;
    private Dado dado;
    private No sucessor;

    public No(Dado dado) {
        this.antecessor = null;
        this.dado = dado;
        this.sucessor = null;
    }

    public No getAntecessor() {
        return antecessor;
    }

    public void setAntecessor(No antecessor) {
        this.antecessor = antecessor;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public No getSucessor() {
        return sucessor;
    }

    public void setSucessor(No sucessor) {
        this.sucessor = sucessor;
    }
}

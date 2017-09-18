public class ListaDuplamenteEncadeada {
    private int quantidade;
    private No primeiro;
    private No ultimo;
    private No atual;

    public ListaDuplamenteEncadeada() {
        this.quantidade = 0;
        this.primeiro = null;
        this.ultimo = null;
        this.atual = null;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public No getAtual() {
        return atual;
    }

    public void setAtual(No atual) {
        this.atual = atual;
    }

    public void inserirAntesDoAtual(Dado dado){
        No novo = new No(dado);
        novo.setSucessor(getAtual());
        novo.setAntecessor(getAtual().getAntecessor());
        getAtual().setAntecessor(novo);
        if (getAtual() == getPrimeiro()){
            setPrimeiro(novo);
        }
        setQuantidade(getQuantidade()+1);
    }

    public void inserirAposAtual(Dado dado){
        No novo = new No(dado);
        if (getAtual().getSucessor() != null) {
            novo.setSucessor(getAtual().getSucessor());
        }
        novo.setAntecessor(getAtual());
        if (getAtual().equals(getUltimo())) setUltimo(novo);
        setQuantidade(getQuantidade()+1);
    }

    public void excluirAtual(){
        getAtual().getAntecessor().setSucessor(getAtual().getSucessor());
        getAtual().getSucessor().setAntecessor(getAtual().getAntecessor());
        setQuantidade(getQuantidade()-1);
    }

    public boolean buscar(Dado dado){
        No buscador = getPrimeiro();
        int i = 1;
        while (!buscador.getDado().getDado().equals(dado.getDado()) || i <= getQuantidade()){
            buscador = buscador.getSucessor();
            i++;
        }
        if (dado.equals(buscador.getDado())){
            return true;
        }
        return false;
    }

    public void avancarKPassos(int k){
        int i = 1;
        while (i <= k){
            setAtual(getAtual().getSucessor());
            i++;
        }
    }

    public void retrocederKPassos(int k){
        int i = 1;
        while (i <= k){
            setAtual(getAtual().getAntecessor());
            i++;
        }
    }

    public void irParaPrimeiro(){
        setAtual(getPrimeiro());
    }

    public void irParaUltimo(){
        setAtual(getUltimo());
    }

    public void inserirDado(Dado dado){
        No novo = new No(dado);
        novo.setAntecessor(getUltimo());
        if (getUltimo() != null) {
            getUltimo().setSucessor(novo);
        }
        setUltimo(novo);
        setQuantidade(getQuantidade()+1);
    }


}

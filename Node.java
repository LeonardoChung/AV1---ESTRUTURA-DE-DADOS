public class Node {
    private Object informacao;
    private Node proximo;

    public Node() {
        this.informacao = null;
        this.proximo = null;
    }

    public Object getInformacao() {
        return informacao;
    }

    public void setInformacao(Object informacao) {
        this.informacao = informacao;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}

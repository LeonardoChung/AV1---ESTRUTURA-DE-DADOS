public class Pilha {
    private Node topo;

    // inicializa a pilha como vazia
    public Pilha() {
        this.topo = null;
    }

    // metodo para inserir um historico na pilha
    public void inserir(Historico historico) {
        // instancia um novo nó com o historico
        Node no = new Node();
        no.setInformacao(historico);
        // seta o proximo do novo nó como o topo atual da pilha
        no.setProximo(topo);
        // o topo vira esse nó adicionado
        topo = no;
    }

    public void remover() {
        // se a pilha não estiver vazia, remove o topo
        if (topo != null) {
            topo = topo.getProximo();
            System.out.println("Histórico do topo da pilha removido");
        }
        // se estiver vazia, não há nada para remover
        else {
            System.out.println("Pilha já vzia");
        }
    }

    // metodo para verificar se a pilha está vazia
    public boolean vazio() {
        return topo == null;
    }

    // metodo para imprimir historicos na pilha
    public void imprimir() {
        // se a pilha estiver vazia, não há nada para imprimir
        if (vazio()) {
            System.out.println("Pilha vazia");
        }
        // imprime todos os historicos na pilha
        else {
            Node atual = topo;
            while (atual != null) {
                Historico historico = (Historico) atual.getInformacao();
                System.out.print("\nID: " + historico.getId());
                System.out.print(", Descrição: " + historico.getDescricao());
                System.out.print(", Data: " + historico.getData());
                System.out.print(", Hora: " + historico.getHora());
                System.out.println(" ");
                atual = atual.getProximo();
            }
        }

    }
}

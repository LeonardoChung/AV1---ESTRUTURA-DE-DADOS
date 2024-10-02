public class Fila {
    private Node frente;
    private Node tras;

    // iniciando a fila como vazia
    public Fila() {
        this.frente = null;
        this.tras = null;
    }

    // metodo para inserir um cliente na fila
    public void inserir(Cliente cliente) {

        // instancia um novo nó com o cliente
        Node no = new Node();
        no.setInformacao(cliente);

        // se não existir no na fila, o novo nó será o primeiro e o último
        if (frente == null) {
            frente = no;
            tras = no;
        }
        // se existir, o novo nó será o próximo do último nó
        else {
            tras.setProximo(no);
            tras = no;
        }
    }

    // metodo para remover um cliente da fila
    public void remover() {

        // se a fila não estiver vazia, remove o primeiro nó
        if (frente != null) {
            frente = frente.getProximo();
            System.out.println("Primeiro cliente da fila removido.");
        }
        // se a fila estiver vazia, não há nada para remover
        else{
            System.out.println("Fila já vazia");
        }
    }

    // metodo para verificar se a fila está vazia
    public boolean vazio(){
        return frente == null;
    }

    // metodo para imprimir clientes na fila
    public void imprimir() {

        // se a fila estiver vazia, não há nada para imprimir
        if (vazio()){
            System.out.println("Fila vazia");
        }
        // imprime as imformações de todos os clientes na fila
        else{
            Node atual = frente;
            while (atual != null) {
                Cliente cliente = (Cliente) atual.getInformacao();
                System.out.print("\nIdentificação: " + cliente.getIdentificacao());
                System.out.print(", Nome: " + cliente.getNome());
                System.out.print(", Motivo: " + cliente.getMotivo());
                System.out.println(" ");
                System.out.println(" ");

                atual = atual.getProximo();
            }
        }        
    }
}

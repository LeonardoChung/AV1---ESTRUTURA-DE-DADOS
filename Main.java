import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inserindo dados iniciais na pilha de históricos
        Pilha pilha = new Pilha();
        pilha.inserir(new Historico("REQ001", "Instalação de software", "20-08-2024", "10:30"));
        pilha.inserir(new Historico("REQ002", "Manutenção preventiva", "20-08-2024", "11:00"));
        pilha.inserir(new Historico("REQ003", "Atualização de sistema", "20-08-2024", "11:30"));
        pilha.inserir(new Historico("REQ004", "Suporte técnico", "20-08-2024", "12:00"));
        pilha.inserir(new Historico("REQ005", "Troca de equipamento", "20-08-2024", "12:30"));
        pilha.inserir(new Historico("REQ006", "Consulta de garantia", "20-08-2024", "13:00"));
        pilha.inserir(new Historico("REQ007", "Reparo de impressora", "20-08-2024", "13:30"));
        pilha.inserir(new Historico("REQ008", "Configuração de rede", "20-08-2024", "14:00"));
        pilha.inserir(new Historico("REQ009", "Restauração de dados", "20-08-2024", "14:30"));
        pilha.inserir(new Historico("REQ010", "Consulta técnica", "20-08-2024", "15:00"));

        // inserindo dados iniciais na fila de clientes
        Fila fila = new Fila();
        fila.inserir(new Cliente("CLI001", "Maria Silva", "Dúvida sobre produto"));
        fila.inserir(new Cliente("CLI002", "João Souza", "Reclamação de serviço"));
        fila.inserir(new Cliente("CLI003", "Ana Costa", "Solicitação de reembolso"));
        fila.inserir(new Cliente("CLI004", "Pedro Alves", "Informações de entrega"));
        fila.inserir(new Cliente("CLI005", "Carla Dias", "Agendamento de visita"));
        fila.inserir(new Cliente("CLI006", "Lucas Martins", "Alteração de pedido"));
        fila.inserir(new Cliente("CLI007", "Patrícia Rocha", "Cancelamento de contrato"));
        fila.inserir(new Cliente("CLI008", "Rafael Lima", "Renovação de assinatura"));
        fila.inserir(new Cliente("CLI009", "Fernanda Gomes", "Suporte para instalação"));
        fila.inserir(new Cliente("CLI010", "Carlos Eduardo", "Pedido de orçamento"));

        int opcao = 0;

        while(opcao != 7){
            System.out.println("\n ** MENU **");
            System.out.println(" 1 - Adicionar cliente na fila");
            System.out.println(" 2 - Adicionar historico na pilha");
            System.out.println(" 3 - Remover cliente atendido");
            System.out.println(" 4 - Remover historico");
            System.out.println(" 5 - Imprimir fila");
            System.out.println(" 6 - Imprimir pilha");
            System.out.println(" 7 - Sair");
            System.out.print("Escolha: ");
            int escolha = sc.nextInt();
            sc.nextLine();

            // caso escolha adicionar um cliente
            if (escolha == 1) {
                System.out.print("\nDigite a identificação do cliente: ");
                String identificacao = sc.nextLine();
                System.out.print("Digite o nome do cliente: ");
                String nome = sc.nextLine();
                System.out.print("Digite o motivo da solicitação: ");
                String motivo = sc.nextLine();
                fila.inserir(new Cliente(identificacao, nome, motivo));
                System.out.println("\nCliente adicionado na fila.");
            } 

            // caso escolha adicionar um historico
              else if (escolha == 2) {
                System.out.print("\nDigite o id do historico: ");
                String id = sc.nextLine();
                System.out.print("Digite a descricao do historico: ");
                String descricao = sc.nextLine();
                System.out.print("Digite a data do historico: ");
                String data = sc.nextLine();
                System.out.print("Digite a hora do historico: ");
                String hora = sc.nextLine();
                pilha.inserir(new Historico(id, descricao, data, hora));
                System.out.println("\nHistorico adicionado na pilha.");
            } 

            // caso escolha remover um cliente
              else if (escolha == 3) {
                fila.remover();
            } 

            // caso escolha remover um historico
              else if (escolha == 4) {
                pilha.remover();
            } 

            // caso escolha imprimir a fila
              else if (escolha == 5) {
                fila.imprimir();
            } 

            // caso escolha imprimir a pilha
              else if (escolha == 6) {
                pilha.imprimir();
            } 

            // caso escolha sair
              else if (escolha == 7) {
                System.out.println("\nSaindo...");
                opcao = escolha;
            } 

            // caso escolha opção invalida
              else {
                System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }
}

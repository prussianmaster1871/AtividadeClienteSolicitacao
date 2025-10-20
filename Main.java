public class Main {
    public static void main(String[] args) {

        Cliente[] historico = new Cliente[] {
                new Cliente("REQ001", "Instalação de software", "2024-08-20 10:30"),
                new Cliente("REQ002", "Manutenção preventiva", "2024-08-20 11:00"),
                new Cliente("REQ003", "Atualização de sistema", "2024-08-20 11:30"),
                new Cliente("REQ004", "Suporte técnico", "2024-08-20 12:00"),
                new Cliente("REQ005", "Troca de equipamento", "2024-08-20 12:30"),
                new Cliente("REQ006", "Consulta de garantia", "2024-08-20 13:00"),
                new Cliente("REQ007", "Reparo de impressora", "2024-08-20 13:30"),
                new Cliente("REQ008", "Configuração de rede", "2024-08-20 14:00"),
                new Cliente("REQ009", "Restauração de dados", "2024-08-20 14:30"),
                new Cliente("REQ010", "Consulta técnica", "2024-08-20 15:00")
        };


        Fila fila = new Fila();
        Pilha pilha = new Pilha(10);


        System.out.println("Adicionando primeiros 5 clientes a fila:");
        for (int i = 0; i < 5; i++) {
            fila.insereFila(historico[i]);
        }

        System.out.println("\neStado atual da fila:");
        fila.imprimeFila();

        System.out.println("\nprocessando 2 clientes da fila e adicionando solicitacoes a pilha:");
        for (int i = 0; i < 2; i++) {
            String idRemovido = fila.removeFila();
            if (idRemovido != null) {
                Solicitacao solicitacao = new Solicitacao(
                        idRemovido,
                        historico[i].motivo,
                        "Processado em " + historico[i].nome
                );
                pilha.InserePilha(solicitacao);
            }
        }


        System.out.println("\nestado atual da fila após remoções:");
        fila.imprimeFila();

        System.out.println("\nestado atual da pilha:");
        pilha.ImprimeTudo();

        System.out.println("\nadicionado mais tres clientes a fila:");
        for (int i = 5; i < 8; i++) {
            fila.insereFila(historico[i]);
        }

        System.out.println("\nestado final da fila:");
        fila.imprimeFila();

        System.out.println("\nEstado final da pilha:");
        pilha.ImprimeTudo();
    }
}
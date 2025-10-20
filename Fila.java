public class Fila {
    Noh primeiro;
    Noh ultimo;

    public Fila() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public boolean vazia() {
        return primeiro == null;
    }

    public void insereFila(Cliente cliente) {
        Noh novoNoh = new Noh(cliente);

        if (vazia()) {
            primeiro = novoNoh;
            ultimo = novoNoh;
        } else {
            ultimo.proximo = novoNoh;
            ultimo = novoNoh;
        }
        System.out.println(cliente.nome + "inserido na fila");
    }

    public String removeFila() {
        if (vazia()) {
            System.out.println("fila ja esta vazia");
            return null;
        }

        String nomeRemovido = primeiro.cliente.nome;
        primeiro = primeiro.proximo;

        if (primeiro == null) {
            ultimo = null;
        }

        System.out.println(nomeRemovido + " removido da fila");
        return nomeRemovido;
    }


    public void imprimeFila() {
        if (vazia()) {
            System.out.println("fila vazia");
            return;
        }

        Noh atual = primeiro;
        System.out.print("[");
        while (atual != null) {
            System.out.print(atual.cliente.id + " ");
            System.out.print(atual.cliente.nome + " ");
            System.out.print(atual.cliente.motivo + " ");
            if (atual.proximo != null) {
                System.out.print(", ");
            }
            atual = atual.proximo;
        }
        System.out.println("]");
    }
}
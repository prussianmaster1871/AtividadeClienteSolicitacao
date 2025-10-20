class Pilha {
    private Noh cabeca;
    private int cap;
    private int tamanho;



    public Pilha(int cap) {
        this.cap = cap;
        this.tamanho = 0;
        this.cabeca = null;
    }

    public boolean InserePilha(Solicitacao solicitacao) {
        if (tamanho >= cap) {
            System.out.println("pilha cheia");
            return false;
        }
        Noh novoNode = new Noh(solicitacao);
        novoNode.proximo = cabeca;
        cabeca = novoNode;
        tamanho++;
        return true;
    }

    public String RemovePilha() {
        if (cabeca == null) {
            System.out.println("pilha ja esta vazia");
            return null;
        }
        String valorRemovido = cabeca.solicitacao.id ;
        cabeca = cabeca.proximo;
        tamanho--;
        return valorRemovido;
    }

    public boolean Vazia() {
        return cabeca == null;
    }


    public void ImprimeTudo() {
        Noh atual = cabeca;
        while (atual != null) {
        System.out.print(atual.solicitacao.id + " ");
        System.out.print(atual.solicitacao.dataHora + " ");
        System.out.print(atual.solicitacao.descricao + " ");

        atual = atual.proximo;
        }
        System.out.println();
        }
}


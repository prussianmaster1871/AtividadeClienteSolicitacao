public class Noh{
    Noh proximo;
    Cliente cliente;
    Solicitacao solicitacao;

    public Noh(Cliente cliente){
        this.cliente = cliente;
        this.solicitacao = null;
        this.proximo = null;
    }

    public Noh(Solicitacao solicitacao){
        this.cliente = null;
        this.solicitacao = solicitacao;
        this.proximo = null;
    }
}
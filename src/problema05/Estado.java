package problema05;

public interface Estado {
    String getNome();
    void aprovar(Orcamento orcamento);
    void reprovar(Orcamento orcamento);
    void finalizar(Orcamento orcamento);
}

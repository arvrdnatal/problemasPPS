package problema05;

public class Finalizado implements Estado {
    private String nome;

    public Finalizado() {
        this.nome = "Finalizado";
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Já está finalizado");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Já está finalizado");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Já está finalizado");
    }
}

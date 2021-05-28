package problema05;

public class Aprovado implements Estado {
    private String nome;

    public Aprovado() {
        this.nome = "Aprovado";
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Já está aprovado");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Já está aprovado");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstado(new Finalizado());
    }
}

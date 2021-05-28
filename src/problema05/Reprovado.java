package problema05;

public class Reprovado implements Estado {
    private String nome;

    public Reprovado() {
        this.nome = "Reprovado";
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Já está reprovado");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Já está reprovado");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstado(new Finalizado());
    }
}

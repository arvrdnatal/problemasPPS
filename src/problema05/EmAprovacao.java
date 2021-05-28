package problema05;

public class EmAprovacao implements Estado {
    private String nome;

    public EmAprovacao() {
        this.nome = "Em aprovação";
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setEstado(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setEstado(new Reprovado());
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Não pode ser finalizado");
    }
}

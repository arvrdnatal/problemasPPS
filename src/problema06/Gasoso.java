package problema06;

public class Gasoso implements Estado {
    private String nome = "Gasoso";

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void solidificar(Substancia substancia) {
        throw new RuntimeException("gasoso não solidifica");
    }

    @Override
    public void fundir(Substancia substancia) {
        throw new RuntimeException("gasoso não entra em estado de fusão");
    }

    @Override
    public void condensar(Substancia substancia) {
        substancia.setEstado(new Liquido());
    }

    @Override
    public void vaporizar(Substancia substancia) {
        throw new RuntimeException("gasoso já está em estado de vaporização");
    }
}

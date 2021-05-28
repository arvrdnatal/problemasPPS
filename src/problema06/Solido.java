package problema06;

public class Solido implements Estado {
    private String nome = "Sólido";

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void solidificar(Substancia substancia) {
        throw new RuntimeException("já é sólido");
    }

    @Override
    public void fundir(Substancia substancia) {
        substancia.setEstado(new Liquido());
    }

    @Override
    public void condensar(Substancia substancia) {
        throw new RuntimeException("sólido não condensa");
    }

    @Override
    public void vaporizar(Substancia substancia) {
        throw new RuntimeException("sólido não vaporiza");
    }
}

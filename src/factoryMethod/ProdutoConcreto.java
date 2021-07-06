package factoryMethod;

public class ProdutoConcreto implements Produto {
    private String nome;

    public ProdutoConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public String nome() {
        return nome;
    }
}

package problema14v2;

public class Produto implements Elemento {
    private String nome;
    private float preco;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return this.preco;
    }
}

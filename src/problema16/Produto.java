package problema16;

public class Produto implements Item {
    private float preco;

    public Produto(float preco) {
        this.preco = preco;
    }

    @Override
    public float preco() {
        return this.preco;
    }
}

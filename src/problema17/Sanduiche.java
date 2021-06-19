package problema17;

public class Sanduiche implements Comida {
    private float preco;

    public Sanduiche(float preco) {
        this.preco = preco;
    }

    @Override
    public float preco() {
        return this.preco;
    }
}

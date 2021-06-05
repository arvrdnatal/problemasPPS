package problema14v1;

public class Item {
    private int quantidade;
    private Elemento elemento;

    public Item(int quantidade, Elemento elemento) {
        this.quantidade = quantidade;
        this.elemento = elemento;
    }

    public Item(Elemento elemento) {
        this(1, elemento);
    }

    public float subTotal() {
        return elemento.getPreco() * quantidade;
    }
}

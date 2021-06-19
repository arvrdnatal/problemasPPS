package problema16;

public abstract class Desconto implements Item {
    protected Item item;

    public Desconto(Item item) {
        this.item = item;
    }
}

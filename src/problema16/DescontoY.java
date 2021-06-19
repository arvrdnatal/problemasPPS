package problema16;

public class DescontoY extends Desconto {
    private float desconto;

    public DescontoY(Item item, float desconto) {
        super(item);
        this.desconto = desconto;
    }

    @Override
    public float preco() {
        return this.item.preco() - this.desconto;
    }
}

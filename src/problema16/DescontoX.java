package problema16;

public class DescontoX extends Desconto {
    private float desconto;

    public DescontoX(Item item, float desconto) {
        super(item);
        this.desconto = desconto;
    }

    @Override
    public float preco() {
        return this.item.preco() - this.desconto;
    }
}

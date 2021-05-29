package problema11;

public class DescontoBom implements Desconto {
    @Override
    public double calcularDesconto(Pedido pedido) {
        return pedido.getValor() * 0.1;
    }
}

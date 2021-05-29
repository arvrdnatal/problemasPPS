package problema11;

public class DescontoMaisOuMenos implements Desconto {
    @Override
    public double calcularDesconto(Pedido pedido) {
        return pedido.getValor() * 0.6;
    }
}

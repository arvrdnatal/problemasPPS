package problema11;

public class SemDesconto implements Desconto {
    @Override
    public double calcularDesconto(Pedido pedido) {
        return pedido.getValor();
    }
}

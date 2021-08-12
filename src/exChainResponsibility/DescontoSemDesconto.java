package exChainResponsibility;

public class DescontoSemDesconto implements Desconto {
    private Desconto desconto;

    @Override
    public double getValor(Pedido pedido) {
        if(pedido.getQuantidade() >= 5) return pedido.getValor() - (pedido.getValor() * .1);
        return pedido.getValor();
    }

    @Override
    public void definirProximoDesconto(Desconto desconto) {
        // fim
    }
}

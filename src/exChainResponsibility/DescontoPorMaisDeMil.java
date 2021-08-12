package exChainResponsibility;

public class DescontoPorMaisDeMil implements Desconto {
    private Desconto desconto;

    @Override
    public double getValor(Pedido pedido) {
        if(pedido.getValor() >= 1000) return pedido.getValor() - (pedido.getValor() * .2);
        return pedido.getValor();
    }

    @Override
    public void definirProximoDesconto(Desconto desconto) {
        this.desconto = desconto;
    }
}

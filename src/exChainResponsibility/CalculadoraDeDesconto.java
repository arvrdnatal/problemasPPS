package exChainResponsibility;

public class CalculadoraDeDesconto {
    public double calcular(Pedido pedido) {
        Desconto d1 = new DescontoPorMaisDeMil();
        Desconto d2 = new DescontoPorMaisDeCincoItens();
        Desconto d3 = new DescontoSemDesconto();

        d1.definirProximoDesconto(d2);
        d2.definirProximoDesconto(d3);

        return d1.getValor(pedido);
    }
}

package exChainResponsibility;

public interface Desconto {
    double getValor(Pedido pedido);
    void definirProximoDesconto(Desconto desconto); //chain of responsabiliy
}

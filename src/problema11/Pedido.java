package problema11;

public class Pedido {
    private double valor;
    private Desconto desconto;

    public Pedido(double valor) {
        this(valor, new SemDesconto());
    }

    public Pedido(double valor, Desconto desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public double calcularDesconto() {
        return this.desconto.calcularDesconto(this);
    }

    public double getValor() {
        return this.valor;
    }
}

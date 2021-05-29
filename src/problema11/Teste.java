package problema11;

public class Teste {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(100, new DescontoBom());
        Pedido pedido2 = new Pedido(200);
        Pedido pedido3 = new Pedido(100, new DescontoMaisOuMenos());

        System.out.println(pedido.calcularDesconto());
        System.out.println(pedido2.calcularDesconto());
        System.out.println(pedido3.calcularDesconto());
    }
}

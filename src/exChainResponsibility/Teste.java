package exChainResponsibility;

public class Teste {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Item("Caneta", 600.0));
        pedido.adicionarItem(new Item("Caneta", 100.0));
        pedido.adicionarItem(new Item("Caneta", 100.0));
        pedido.adicionarItem(new Item("Caneta", 100.0));
        pedido.adicionarItem(new Item("Caneta", 100.0));
        System.out.println("Total: " + pedido.getValor());

        double total = new CalculadoraDeDesconto().calcular(pedido);
        System.out.println("Total com desconto:" + total);
    }
}

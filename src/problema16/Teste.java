package problema16;

public class Teste {
    public static void main(String[] args) {
        Item produto = new Produto(100);
        Desconto x = new DescontoX(produto, 10);
        System.out.println(x.preco()); // R$ 90,00
        Desconto y = new DescontoY(x, 5);
        System.out.println(y.preco()); // R$ 85,00
    }
}

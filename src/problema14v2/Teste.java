package problema14v2;

public class Teste {
    public static void main(String[] args) {
        Produto cerveja = new Produto("Cerveja", 10);
        Produto carne = new Produto("Carne", 30);
        Produto fralda = new Produto("Fralda", 30);

        //Cliente ze = new Cliente("ze");

        Pedido pedido = new Pedido();

        Kit kit = new Kit("Kit Churras");
        kit.adicionar(1, cerveja);
        kit.adicionar(2, carne);

        pedido.adicionar(1, kit);
        pedido.adicionar(2, fralda);

        System.out.println(pedido.total());
    }
}

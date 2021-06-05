package problema14v1;

public class Teste {
    public static void main(String[] args) {
        Produto cerveja = new Produto("Cerveja", 10);
        Produto carne = new Produto("Carne", 30);
        Produto fralda = new Produto("Fralda", 30);

        //Cliente ze = new Cliente("ze");

        Pedido pedido = new Pedido();

        Kit kit = new Kit("Kit Churras");
        kit.adicionar(cerveja);
        kit.adicionar(carne);

        pedido.adicionar(new Item(1, kit));
        pedido.adicionar(new Item(2, fralda));

        System.out.println(pedido.total());

        // problema: pode-se adicionar kits dentro de outro kit
    }
}

package problema17;

public class Teste {
    public static void main(String[] args) {
        Comida sanduiche = new Sanduiche(10);
        Complemento batata = new BatataPalha(sanduiche, 2);
        System.out.println(batata.preco()); // R$ 12,00
        Complemento queijo = new QueijoRalado(batata, 3);
        System.out.println(queijo.preco()); // R$ 15,00
    }
}

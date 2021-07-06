package willyWonka;

public class TesteVenda {
    public static void main(String[] args) {
        LojaWonka fabrica = new LojaWonka(new SimpleWonkaFactory());
        fabrica.organizarChocolate("chocolate branco");
    }
}

package willyWonka;

public class LojaWonka {
    SimpleWonkaFactory factory;

    public LojaWonka(SimpleWonkaFactory factory) {
        this.factory = factory;
    }

    public void organizarChocolate(String tipo) {
        Chocolate chocolate = factory.criarChocolate(tipo);
        chocolate.preparar();
        chocolate.assar();
        chocolate.esfriar();
        chocolate.embalar();
    }
}

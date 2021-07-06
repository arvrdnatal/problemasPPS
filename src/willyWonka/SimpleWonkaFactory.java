package willyWonka;

public class SimpleWonkaFactory {
    public Chocolate criarChocolate(String tipo) {
        Chocolate chocolate = null;

        if(tipo.equalsIgnoreCase("chocolate preto")) chocolate = new ChocolatePreto();
        else if(tipo.equalsIgnoreCase("chocolate branco")) chocolate = new ChocolateBranco();
        else if(tipo.equalsIgnoreCase("chocolate crocante")) chocolate = new ChocolateCrocante();
        else if(tipo.equalsIgnoreCase("chocolate nozes")) chocolate = new ChocolateNozes();

        return chocolate;
    }
}

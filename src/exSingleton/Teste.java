package exSingleton;

public class Teste {
    public static void main(String[] args) {
        Highlander.INSTANCE.testar();
        // ou
        Highlander unico = Highlander.INSTANCE;
        unico.testar();
    }
}

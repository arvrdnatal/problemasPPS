package problema06;

public class Teste {
    public static void main(String[] args) {
        Substancia agua = new Agua();
        agua.setEstado(new Liquido());
        agua.condensar();
        agua.getEstado().getNome();
    }
}

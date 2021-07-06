package willyWonka;

public class ChocolateNozes implements Chocolate {
    @Override
    public void preparar() {
        System.out.println("Preparando cn...");
    }

    @Override
    public void assar() {
        System.out.println("Assando cn...");
    }

    @Override
    public void esfriar() {
        System.out.println("Esfriando cn...");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando cn...");
    }
}

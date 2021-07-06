package willyWonka;

public class ChocolateBranco implements Chocolate {
    @Override
    public void preparar() {
        System.out.println("Preparando cb...");
    }

    @Override
    public void assar() {
        System.out.println("Assando cb...");
    }

    @Override
    public void esfriar() {
        System.out.println("Esfriando cb...");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando cb...");
    }
}

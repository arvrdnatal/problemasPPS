package willyWonka;

public class ChocolatePreto implements Chocolate {
    @Override
    public void preparar() {
        System.out.println("Preparando cp...");
    }

    @Override
    public void assar() {
        System.out.println("Assando cp...");
    }

    @Override
    public void esfriar() {
        System.out.println("Esfriando cp...");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando cp...");
    }
}

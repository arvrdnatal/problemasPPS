package willyWonka;

public class ChocolateCrocante implements Chocolate {
    @Override
    public void preparar() {
        System.out.println("Preparando cc...");
    }

    @Override
    public void assar() {
        System.out.println("Assando cc...");
    }

    @Override
    public void esfriar() {
        System.out.println("Esfriando cc...");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando cc...");
    }
}

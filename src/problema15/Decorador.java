package problema15;

public abstract class Decorador implements Forma {
    protected Forma forma;

    public Decorador(Forma forma) {
        this.forma = forma;
    }

    @Override
    public String desenhar() {
        return this.forma.desenhar();
    }
}

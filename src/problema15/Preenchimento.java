package problema15;

public class Preenchimento extends Decorador {
    public Preenchimento(Forma forma) {
        super(forma);
    }

    @Override
    public String desenhar() {
        return this.forma.desenhar().replace("\n", "") + " com preenchimento\n";
    }
}

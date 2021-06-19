package problema15;

public class Linha extends Decorador {
    private double largura;

    public Linha(double largura, Forma forma) {
        super(forma);
        this.largura = largura;
    }

    @Override
    public String desenhar() {
        return this.forma.desenhar().replace("\n", "") + " e linha desenhada\n";
    }
}

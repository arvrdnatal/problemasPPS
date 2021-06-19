package problema15;

public class Cor extends Decorador {
    private String cor;

    public Cor(String cor, Forma forma) {
        super(forma);
        this.cor = cor;
    }

    @Override
    public String desenhar() {
        return this.forma.desenhar().replace("\n", "") + " com a cor " + this.cor + "\n";
    }
}

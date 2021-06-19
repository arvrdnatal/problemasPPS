package problema15;

public class Circulo implements Forma {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public String desenhar() {
        return "círculo desenhado\n";
    }
}

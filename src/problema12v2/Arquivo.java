package problema12v2;

public class Arquivo implements Elemento {
    private final String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}

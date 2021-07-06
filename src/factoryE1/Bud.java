package factoryE1;

public class Bud implements Cerveja {
    private String nome;

    public Bud(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}

package problema12v1;

public class Arquivo implements Elemento {
    private final String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarElemento(Elemento elemento) {
        System.out.println("Um arquivo não pode adicionar nada!");
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}

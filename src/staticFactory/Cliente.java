package staticFactory;

public class Cliente {
    private String nome;
    private Tipo tipo;

    private Cliente(String nome, Tipo tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public static Cliente criarNormal(String nome) {
        return new Cliente(nome, Tipo.NORMAL);
    }

    public static Cliente criarEspecial(String nome) {
        return new Cliente(nome, Tipo.ESPECIAL);
    }

    public void mostrar() {
        System.out.println(nome + " - " + tipo.getNome());
    }
}

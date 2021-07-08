package staticFactory;

public class Tipo {
    public static Tipo NORMAL = new Tipo("normal");
    public static Tipo ESPECIAL = new Tipo("especial");
    private String nome;

    private Tipo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

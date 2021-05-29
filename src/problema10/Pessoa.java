package problema10;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome) {
        this(nome, new SemEndereco());
    }

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getDadosPessoais() {
        return this.nome + " - " + this.endereco.getRua();
    }
}

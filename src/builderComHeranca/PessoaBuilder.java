package builderComHeranca;

public class PessoaBuilder extends PessoaPadrao {
    public PessoaBuilder(String nome, String email) {
        super(nome, email);
    }

    public PessoaBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public PessoaBuilder setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public Pessoa constroi() {
        return new PessoaPadrao(this);
    }
}

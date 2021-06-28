package builderComHeranca;

public class PessoaPadrao implements Pessoa {
    // obrigatórios
    private String nome;
    private String email;

    // opicionais
    protected String telefone;
    protected String endereco;

    public PessoaPadrao(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    protected PessoaPadrao(PessoaBuilder builder) {
        this(builder.nome(), builder.email());
        this.telefone = builder.telefone();
        this.endereco = builder.endereco();
    }

    @Override
    public String nome() {
        return this.nome;
    }

    @Override
    public String email() {
        return this.email;
    }

    @Override
    public String telefone() {
        return this.telefone;
    }

    @Override
    public String endereco() {
        return this.endereco;
    }
}

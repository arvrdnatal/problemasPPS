package builderAninhado;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;

    private Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    private Pessoa(Builder builder) {
        this(builder.nome, builder.email);
        this.telefone = builder.telefone;
    }

    static class Builder {
        private String nome;
        private String email;
        private String telefone;

        public Builder(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public Builder setTelefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Pessoa constroi() {
            return new Pessoa(this);
        }
    }
}

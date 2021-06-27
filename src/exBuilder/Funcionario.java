package exBuilder;

public class Funcionario {
    private String primeiroNome; //obrigatorio
    private String ultimoNome;  //obrigatorio
    private int idade;          //obrigatorio
    private int documento;   //obrigatorio
    private String fone;     //opcional
    private String endereco;   //opcional
    private String email;      //opcional

    public Funcionario(FuncionarioBuilder builder) {
        this.primeiroNome = builder.primeiroNome;
        this.ultimoNome = builder.ultimoNome;
        this.idade = builder.idade;
        this.documento = builder.documento;
        this.fone = builder.fone;
        this.endereco = builder.endereco;
        this.email = builder.email;
    }

    public static class FuncionarioBuilder {
        private final String primeiroNome; //obrigatorio
        private final String ultimoNome;  //obrigatorio
        private final int idade;          //obrigatorio
        private final int documento;   //obrigatorio
        private String fone;     //opcional
        private String endereco;   //opcional
        private String email;      //opcional

        public FuncionarioBuilder(String primeiroNome, String ultimoNome, int idade, int documento) {
            this.primeiroNome = primeiroNome;
            this.ultimoNome = ultimoNome;
            this.idade = idade;
            this.documento = documento;
        }

        public FuncionarioBuilder setEndereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public FuncionarioBuilder setFone(String fone) {
            this.fone = fone;
            return this;
        }

        public FuncionarioBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Funcionario build() {
            return new Funcionario(this);
        }
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

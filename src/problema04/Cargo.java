package problema04;

public class Cargo {
    private String nome;
    private double bonificacao;

    public Cargo(String nome, double bonificacao) {
        this.nome = nome;
        this.bonificacao = (bonificacao / 100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = (bonificacao / 100);
    }
}

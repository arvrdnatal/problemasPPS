package simpleFactory;

public class CursoB implements ICurso {
    private String nome;
    private Double duracao;

    public CursoB(String nome, Double duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Double getDuracao() {
        return duracao;
    }

    @Override
    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }
}

package problema06;

public class Agua implements Substancia {
    private String nome;
    private Estado estado;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Estado getEstado() {
        return this.estado;
    }

    @Override
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public void solidificar() {
        this.estado.solidificar(this);
    }

    @Override
    public void fundir() {
        this.estado.fundir(this);
    }

    @Override
    public void condensar() {
        this.estado.condensar(this);
    }

    @Override
    public void vaporizar() {
        this.estado.vaporizar(this);
    }
}

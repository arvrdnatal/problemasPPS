package problema05;

public class Orcamento {
    private Double valor;
    private Estado estado;

    public Orcamento(Double valor) {
        this.valor = valor;
        this.estado = new EmAprovacao();
    }

    public void aprovar() {
        this.estado.aprovar(this);
    }

    public void reprovar() {
        this.estado.reprovar(this);
    }

    public void finalizar() {
        this.estado.finalizar(this);
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado.getNome();
    }
}

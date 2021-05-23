package problema03;

public abstract class Lutador {
    private Pulo pulo;
    private Rolamento rolamento;

    public Lutador(Pulo pulo, Rolamento rolamento) {
        this.pulo = pulo;
        this.rolamento = rolamento;
    }

    public void chutar() {
        System.out.println("chutando...");
    }

    public void socar() {
        System.out.println("socando...");
    }

    public void pular() {
        this.pulo.pular();
    }

    public void rolar() {
        this.rolamento.rolar();
    }

    public void setPulo(Pulo pulo) {
        this.pulo = pulo;
    }

    public void setRolamento(Rolamento rolamento) {
        this.rolamento = rolamento;
    }
}

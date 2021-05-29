package problema07;

public class Sinaleira {
    private Estado estado;

    public Sinaleira() {
        this.estado = new Vermelho();
    }

    public void ligar() {
        for(int i = 0; i < 10; i++){
            System.out.println(this.getEstado());
            this.mudar();
        }
    }

    public void mudar() {
        this.estado.mudar(this);
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado.getEstado();
    }
}

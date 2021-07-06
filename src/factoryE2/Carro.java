package factoryE2;

public abstract class Carro {
    private String nome;
    private Motor motor;

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Motor getMotor();

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}

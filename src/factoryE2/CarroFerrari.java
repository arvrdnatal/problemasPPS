package factoryE2;

public class CarroFerrari extends Carro {
    public CarroFerrari(String nome) {
        super(nome);
    }

    @Override
    public Motor getMotor() {
        return new MotorFerrari("v12");
    }
}

package factoryE2;

public class CarroFusca extends Carro {
    public CarroFusca(String nome) {
        super(nome);
    }

    @Override
    public Motor getMotor() {
        return new MotorFusca("1500");
    }
}

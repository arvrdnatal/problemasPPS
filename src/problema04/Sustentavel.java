package problema04;

public class Sustentavel implements Bonus {
    @Override
    public double calcularBonus(Funcionario funcionario) {
        return funcionario.calcularSalarioComBonificacao() * 1.20; // +20%
    }
}

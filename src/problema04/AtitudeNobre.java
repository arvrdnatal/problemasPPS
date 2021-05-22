package problema04;

public class AtitudeNobre implements Bonus {
    @Override
    public double calcularBonus(Funcionario funcionario) {
        return funcionario.calcularSalarioComBonificacao() + 100; // +100,00
    }
}

package problema04;

public class FilhoNovo implements Bonus {
    @Override
    public double calcularBonus(Funcionario funcionario) {
        return funcionario.calcularSalarioComBonificacao() * 1.10; // +10%
    }
}

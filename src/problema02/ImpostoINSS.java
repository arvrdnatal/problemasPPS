package problema02;

public class ImpostoINSS implements Imposto {
    @Override
    public double calcularImposto(Salario salario) {
        // valor - 8%
        return salario.getValor() * 0.92;
    }
}

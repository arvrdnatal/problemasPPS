package problema02;

public class ImpostoIR implements Imposto {
    @Override
    public double calcularImposto(Salario salario) {
        // valor - 20%
        return salario.getValor() * 0.80;
    }
}

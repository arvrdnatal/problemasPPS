package problema02;

public class CalculadoraDeImpostos {
    // primeiro jeito: implementando no método
    /*public double calcularImposto(Salario salario, Imposto imposto){
        return imposto.calcularImposto(salario);
    }*/

    // segundo jeito: implementando na classe
    private Imposto imposto;

    public CalculadoraDeImpostos(Imposto imposto) {
        this.imposto = imposto;
    }

    public double calcularImposto(Salario salario){
        return this.imposto.calcularImposto(salario);
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }
}

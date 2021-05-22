package problema02;

public class Teste {
    public static void main(String[] args) {
        // testes:
        Salario salario = new Salario(100);

        //Imposto inss = new ImpostoINSS();
        //Imposto ir = new ImpostoIR();

        // primeiro jeito
        /*CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcularImposto(salario, new ImpostoINSS())); // resultado = 92,0
        System.out.println(calculadoraDeImpostos.calcularImposto(salario, new ImpostoIR())); // resultado = 80,0*/

        // segundo jeito
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos(new ImpostoINSS());
        System.out.println(calculadoraDeImpostos.calcularImposto(salario)); // resultado = 92,0
        calculadoraDeImpostos.setImposto(new ImpostoIR());
        System.out.println(calculadoraDeImpostos.calcularImposto(salario)); // resultado = 80,0
    }
}

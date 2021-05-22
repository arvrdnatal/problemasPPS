package problema04;

public class Teste {
    public static void main(String[] args) {
        // testes:

        Funcionario f1 = new Funcionario("f1", 1000, new Cargo("c1", 100)); // atitude nobre -> total = 2100,00
        Funcionario f2 = new Funcionario("f2", 1100, new Cargo("c2", 150)); // novo filho -> total = 3025,00
        Funcionario f3 = new Funcionario("f3", 1200, new Cargo("c3", 200)); // atitude sustentavel -> total = 4320,00

        System.out.println(f1.calcularSalarioComBonificacaoEspecial(new AtitudeNobre()));
        System.out.println(f2.calcularSalarioComBonificacaoEspecial(new FilhoNovo()));
        System.out.println(f3.calcularSalarioComBonificacaoEspecial(new Sustentavel()));
    }
}

package simpleFactory;

public class Teste {
    public static void main(String[] args) {
        Escola escola = new Escola();
        escola.cadastrarCurso("A", 3.0);

        System.out.println("Cursos:");
        System.out.println(escola.getCursos());
    }
}

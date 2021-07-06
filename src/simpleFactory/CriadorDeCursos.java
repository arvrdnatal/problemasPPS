package simpleFactory;

public class CriadorDeCursos {

    public static ICurso criarCurso(String nome, Double duracao) {
        ICurso icurso = null;
        if (nome.equals("A")) {
            icurso = new CursoA(nome, duracao);
        } else if (nome.equals("B")) {
            icurso = new CursoB(nome, duracao);
        }
        return icurso;
    }
}

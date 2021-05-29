package problema08;

public class Semestre3 implements Semestre {
    @Override
    public String getSemestre() {
        return "Semestre 3";
    }

    @Override
    public void avancar(Aluno aluno) {
        throw new RuntimeException("Não avança mais! Chegou ao final!");
    }
}

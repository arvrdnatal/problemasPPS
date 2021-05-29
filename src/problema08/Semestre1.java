package problema08;

public class Semestre1 implements Semestre {
    @Override
    public String getSemestre() {
        return "Semestre 1";
    }

    @Override
    public void avancar(Aluno aluno) {
        aluno.setSemestre(new Semestre2());
    }
}

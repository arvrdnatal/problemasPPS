package problema08;

public class Semestre2 implements Semestre {
    @Override
    public String getSemestre() {
        return "Semestre 2";
    }

    @Override
    public void avancar(Aluno aluno) {
        aluno.setSemestre(new Semestre3());
    }
}

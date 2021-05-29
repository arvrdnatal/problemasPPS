package problema08;

public class Aluno {
    private Semestre semestre;

    public Aluno() {
        this.semestre = new Semestre1();
    }

    public void avancar() {
        this.semestre.avancar(this);
    }

    public String getSemestre() {
        return this.semestre.getSemestre();
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }
}

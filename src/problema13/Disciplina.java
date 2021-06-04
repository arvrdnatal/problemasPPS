package problema13;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private boolean status;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.status = false;
    }

    public void concluir() {
        this.status = true;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public boolean estaConcluida() {
        return this.status;
    }
}

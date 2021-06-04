package problema13;

import java.util.ArrayList;
import java.util.List;

public class Modulo {
    private String nome;
    private List<Disciplina> disciplinas;

    public Modulo(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public int getCargaHoraria() {
        int carga = 0;
        for(Disciplina disciplina : this.disciplinas) {
            carga += disciplina.getCargaHoraria();
        }
        return carga;
    }

    public boolean estaConcluido() {
        for(Disciplina disciplina : this.disciplinas) {
            if(!disciplina.estaConcluida()){
                return false;
            }
        }
        return true;
    }

    public String exibir() {
        String modulo = "+ " + this.nome;
        if(this.estaConcluido()) {
            modulo += " (concluído)";
        } else {
            modulo += " (não concluído)";
        }
        for(Disciplina disciplina : this.disciplinas) {
            if(disciplina.estaConcluida()) {
                modulo += "\n-- " + disciplina.getNome() + " (concluída)";
            } else {
                modulo += "\n-- " + disciplina.getNome() + " (não concluída)";
            }
        }
        return modulo;
    }
}

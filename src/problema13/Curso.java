package problema13;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Modulo> modulos;

    public Curso(String nome) {
        this.nome = nome;
        this.modulos = new ArrayList<>();
    }

    public void adicionarModulos(Modulo modulo) {
        this.modulos.add(modulo);
    }

    public int getCargaHoraria() {
        int carga = 0;
        for(Modulo modulo : this.modulos) {
            carga += modulo.getCargaHoraria();
        }
        return carga;
    }

    public boolean estaConcluido() {
        for(Modulo modulo : this.modulos) {
            if(!modulo.estaConcluido()){
                return false;
            }
        }
        return true;
    }

    public void exibir() {
        String curso = this.nome;
        if(this.estaConcluido()) {
            curso += " (concluído)";
        } else {
            curso += " (não concluído)";
        }
        for(Modulo modulo : this.modulos) {
            curso += "\n" + modulo.exibir();
        }
        System.out.println(curso);
    }
}

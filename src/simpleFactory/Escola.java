package simpleFactory;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private final CriadorDeCursos criadorDeCursos;
    private final List<ICurso> cursos;

    public Escola() {
        this.cursos = new ArrayList<>();
        this.criadorDeCursos = new CriadorDeCursos();
    }

    public void cadastrarCurso(String nome, double duracao) {
        ICurso curso = this.criadorDeCursos.criarCurso(nome, duracao);
        this.cursos.add(curso);
    }

    public String getCursos() {
        StringBuilder frase = new StringBuilder("Cursos:\n\n");
        String curso;
        for(ICurso c : cursos) {
            if(c != null) {
                curso = c.getNome() + " - " + c.getDuracao();
                frase.append(curso);
            }
        }
        return frase.toString();
    }
}

package simpleFactory;

import java.util.List;

public class GerenciadorDeEventos {
    public void cadastrarCurso(String nome, double duracao) {
        ICurso curso = CriadorDeCursos.criarCurso(nome, duracao);
    }
}

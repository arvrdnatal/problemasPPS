package problema09;

public interface Estado {
    // REMOVE o livro
    void remover(Livro livro, ListaDeLivros listaDeLivros);

    // VERIFICA a remoção do livro
    boolean possoRemover(Livro livro, ListaDeLivros listaDeLivros);
}

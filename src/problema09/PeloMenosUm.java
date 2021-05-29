package problema09;

public class PeloMenosUm implements Estado {
    // REMOVE
    @Override
    public void remover(Livro livro, ListaDeLivros listaDeLivros) {
        if(listaDeLivros.quantidade() <= 1) throw new RuntimeException("Não é possível remover!");
        listaDeLivros.remover(livro);
    }

    // VERIFICA
    @Override
    public boolean possoRemover(Livro livro, ListaDeLivros listaDeLivros) {
        if(listaDeLivros.quantidade() > 1) return true;
        return false;
    }
}

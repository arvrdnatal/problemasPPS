package problema09;

public class Biblioteca {
    private ListaDeLivros listaDeLivros;
    private Estado estado;

    public Biblioteca() {
        this.listaDeLivros = new ListaDeLivros();
    }

    public int quantidade() {
        return this.listaDeLivros.quantidade();
    }

    public void adicionar(Livro livro) {
        this.listaDeLivros.adicionar(livro);
    }

    public void remover(Livro livro) {
        // o estado REMOVE o livro
        //this.estado.remover(livro, this.listaDeLivros);

        // o estado VERIFICA se pode remover o livro
        if(this.estado.possoRemover(livro, this.listaDeLivros)) {
            this.listaDeLivros.remover(livro);
        } else {
            throw new RuntimeException("Não é possível remover!");
        }
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}

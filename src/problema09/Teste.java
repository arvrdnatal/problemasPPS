package problema09;

public class Teste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setEstado(new PeloMenosUm());

        Livro a = new Livro("Livro A");
        Livro b = new Livro("Livro B");

        biblioteca.adicionar(a);
        biblioteca.adicionar(b);
        System.out.println(biblioteca.quantidade());

        biblioteca.remover(b);
        System.out.println(biblioteca.quantidade());

        biblioteca.remover(a);
        System.out.println(biblioteca.quantidade());
    }
}

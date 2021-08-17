package descadastro;

public class Teste {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("ze", "zee@");
        Usuario u2 = new Usuario("ana", "ana@");

        Noticia noticia = new Noticia("titulo", "conteudo");

        noticia.registrar(u1);
        noticia.registrar(u2);
        noticia.notificar();
        System.out.println();

        noticia.desregistrar(u2);
        noticia.notificar();
    }
}

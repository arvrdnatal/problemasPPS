package grupoZap;

public class Mensagem {
    private String conteudo;
    private Usuario usuario;

    public Mensagem(String conteudo, Usuario usuario) {
        this.conteudo = conteudo;
        this.usuario = usuario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getUsuario() {
        return usuario.getNome();
    }
}

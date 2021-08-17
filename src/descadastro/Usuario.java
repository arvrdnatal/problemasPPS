package descadastro;

public class Usuario implements Observer {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Notícia enviada para " + nome + " através de " + email);
    }
}

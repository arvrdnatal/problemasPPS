package grupoZap;

public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable observable) {
        System.out.println(nome + " recebeu: " + observable.mensagem() + " de " + observable.usuario());
    }

    public String getNome() {
        return nome;
    }
}

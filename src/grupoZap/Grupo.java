package grupoZap;

import java.util.ArrayList;
import java.util.List;

public class Grupo implements Observable {
    private String nome;
    private List<Observer> observadores;
    private List<Mensagem> mensagens;
    private Mensagem ultimaMensagem;

    private Grupo(String nome) {
        this.nome = nome;
        this.observadores = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public static Grupo criarGrupo(String nome) {
        return new Grupo(nome);
    }

    @Override
    public void adicionar(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void excluir(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar() {
        for(Observer observador : observadores) {
            observador.update(this);
        }
    }

    @Override
    public String mensagem() {
        return ultimaMensagem.getConteudo();
    }

    @Override
    public String usuario() {
        return ultimaMensagem.getUsuario();
    }

    public void novaMensagem(String conteudo, Usuario usuario) {
        this.ultimaMensagem = new Mensagem(conteudo, usuario);
        mensagens.add(ultimaMensagem);
        notificar();
    }
}

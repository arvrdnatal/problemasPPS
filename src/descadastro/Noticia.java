package descadastro;

import java.util.ArrayList;
import java.util.List;

public class Noticia implements Observable {
    private String titulo;
    private String conteudo;
    private List<Observer> observadores = new ArrayList<>();

    public Noticia(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void registrar(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void desregistrar(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar() {
        for(Observer observador : observadores) {
            observador.update();
        }
    }
}

package grupoZap;

public interface Observable {
    void adicionar(Observer observador);
    void excluir(Observer observador);
    void notificar();
    String mensagem();
    String usuario();
}

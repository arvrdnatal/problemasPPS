package descadastro;

public interface Observable {
    void registrar(Observer observador);
    void desregistrar(Observer observador);
    void notificar();
}

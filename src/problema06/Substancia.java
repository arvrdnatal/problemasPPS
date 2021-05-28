package problema06;

public interface Substancia {
    String getNome();
    void setNome(String nome);

    Estado getEstado();
    void setEstado(Estado estado);

    void solidificar();
    void fundir();
    void condensar();
    void vaporizar();
}

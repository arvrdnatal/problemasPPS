package problema06;

public interface Estado {
    String getNome();
    void solidificar(Substancia substancia);
    void fundir(Substancia substancia);
    void condensar(Substancia substancia);
    void vaporizar(Substancia substancia);
}

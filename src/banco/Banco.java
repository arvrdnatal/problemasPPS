package banco;

public interface Banco {
    Cliente recuperar(int id);
    void excluir(int id);
    void salvar(Cliente cliente);
}

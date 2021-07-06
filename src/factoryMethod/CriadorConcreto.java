package factoryMethod;

public class CriadorConcreto implements Criador {
    @Override
    public Produto criarProduto(String nome) {
        return new ProdutoConcreto(nome);
    }
}

package factoryMethod;

public class Teste {
    public static void main(String[] args) {
        Criador criador = new CriadorConcreto();
        Produto produto = criador.criarProduto("produto");
        System.out.println(produto.nome());
    }
}

package staticFactory;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = Cliente.criarNormal("nome");
        cliente.mostrar();

        Cliente cliente1 = Cliente.criarEspecial("nome");
        cliente1.mostrar();
    }
}

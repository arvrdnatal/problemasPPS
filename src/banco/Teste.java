package banco;

public class Teste {
    public static void main(String[] args) {
        Banco real = new BancoReal();
        real.salvar(new Cliente(1, "ze"));
        real.salvar(new Cliente(2, "ana"));

        Banco proxy = new BancoProxy(real);
        Cliente cliente = proxy.recuperar(1);
        Cliente cliente2 = proxy.recuperar(1);
    }
}

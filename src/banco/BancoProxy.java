package banco;

import java.util.HashMap;
import java.util.Map;

public class BancoProxy implements Banco {
    private Banco banco;
    private Map<Integer, Cliente> clientes;

    public BancoProxy(Banco banco) {
        this.banco = banco;
        this.clientes = new HashMap<>();
    }

    @Override
    public Cliente recuperar(int id) {
        if(clientes.containsKey(id)) {
            System.out.println("recuperando cliente do cache");
            return clientes.get(id);
        }
        System.out.println("recuperando cliente do banco real");
        Cliente cliente = banco.recuperar(id);
        clientes.put(id, cliente);
        return cliente;
    }

    @Override
    public void excluir(int id) {
        banco.excluir(id);
        clientes.remove(id);
    }

    @Override
    public void salvar(Cliente cliente) {
        banco.salvar(cliente);
        clientes.put(cliente.getId(), cliente);
    }
}

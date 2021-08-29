package banco;

import java.util.HashMap;
import java.util.Map;

public class BancoReal implements Banco {
    private Map<Integer, Cliente> clientes;

    public BancoReal() {
        this.clientes = new HashMap<>();
    }

    @Override
    public Cliente recuperar(int id) {
        if(clientes.containsKey(id)) return clientes.get(id);
        return null;
    }

    @Override
    public void excluir(int id) {
        clientes.remove(id);
    }

    @Override
    public void salvar(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
    }
}

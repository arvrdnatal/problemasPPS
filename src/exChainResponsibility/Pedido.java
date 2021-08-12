package exChainResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public int getQuantidade() {
        return itens.size();
    }

    public double getValor() {
        double total = 0.0;
        for(Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}

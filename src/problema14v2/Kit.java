package problema14v2;

import java.util.ArrayList;
import java.util.List;

public class Kit implements Elemento {
    private String nome;
    private List<Item> itens;

    public Kit(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionar(int quantidade, Elemento elemento) {
        Item item = new Item(quantidade, elemento);
        this.itens.add(item);
    }

    @Override
    public float getPreco() {
        float somatorio = 0;
        for(Item item : this.itens) {
            somatorio += item.subTotal();
        }
        return somatorio;
    }
}

package problema14v1;

import java.util.ArrayList;
import java.util.List;

public class Kit implements Elemento {
    private String nome;
    private List<Elemento> elementos;

    public Kit(String nome) {
        this.nome = nome;
        this.elementos = new ArrayList<>();
    }

    public void adicionar(Elemento elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public float getPreco() {
        float somatorio = 0;
        for(Elemento elemento : this.elementos) {
            somatorio += elemento.getPreco();
        }
        return somatorio;
    }
}

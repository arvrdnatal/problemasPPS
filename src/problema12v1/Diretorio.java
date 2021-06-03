package problema12v1;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Elemento {
    private String nome;
    private List<Elemento> elementos = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarElemento(Elemento elemento) {
        this.elementos.add(elemento);
        System.out.println(elemento.getNome() + " adicionado com sucesso em " + this.getNome());
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public List<Elemento> getElementos() {
        return elementos;
    }
}

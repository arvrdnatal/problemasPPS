package problema12v2;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Adicionavel {
    private String nome;
    private List<Elemento> elementos;

    public Diretorio(String nome) {
        this.nome = nome;
        elementos = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String exibir() {
        String s = this.getNome();

        for(Elemento elemento : elementos){
            if(elemento instanceof Diretorio){
                s += "\n+" + ((Diretorio) elemento).exibir();
            }else{
                s += "\n--" + elemento.getNome();
            }
        }

        return s;
    }

    @Override
    public void adicionar(Elemento elemento) {
        this.elementos.add(elemento);
        System.out.println(elemento.getNome() + " adicionado com sucesso em " + this.getNome());
    }
}

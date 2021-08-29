package notas;

import org.jfugue.player.Player;

import java.util.List;

public class Piano {
    public void tocar(List<Nota> musica) {
        StringBuilder cancao = new StringBuilder();

        for(Nota nota : musica) {
            cancao.append(nota.simbolo()).append(" ");
        }

        System.out.println(cancao);

        new Player().play(cancao.toString());
    }
}

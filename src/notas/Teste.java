package notas;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Nota> musica = new ArrayList<>();
        FabricaNotasMusicais fabrica = new FabricaNotasMusicais();

        musica.add(fabrica.nota("do"));
        musica.add(fabrica.nota("re"));
        musica.add(fabrica.nota("mi"));
        musica.add(fabrica.nota("fa"));
        musica.add(fabrica.nota("fa"));
        musica.add(fabrica.nota("fa"));

        musica.add(fabrica.nota("do"));
        musica.add(fabrica.nota("re"));
        musica.add(fabrica.nota("do"));
        musica.add(fabrica.nota("re"));
        musica.add(fabrica.nota("re"));
        musica.add(fabrica.nota("re"));

        musica.add(fabrica.nota("do"));
        musica.add(fabrica.nota("sol"));
        musica.add(fabrica.nota("fa"));
        musica.add(fabrica.nota("mi"));
        musica.add(fabrica.nota("mi"));
        musica.add(fabrica.nota("mi"));

        musica.add(fabrica.nota("do"));
        musica.add(fabrica.nota("re"));
        musica.add(fabrica.nota("mi"));
        musica.add(fabrica.nota("fa"));
        musica.add(fabrica.nota("fa"));
        musica.add(fabrica.nota("fa"));

        Piano piano = new Piano();
        piano.tocar(musica);
    }
}

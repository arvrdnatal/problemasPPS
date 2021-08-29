package notas;

import java.util.HashMap;
import java.util.Map;

public class FabricaNotasMusicais {
    private Map<String, Nota> notas = new HashMap<>();

    public FabricaNotasMusicais() {
        this.criarNotas();
    }

    public Nota nota(String nota) {
        return notas.get(nota);
    }

    private void criarNotas() {
        notas.put("do", new Do());
        notas.put("re", new Re());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
        notas.put("sol", new Sol());
        notas.put("la", new La());
        notas.put("si", new Si());
    }
}

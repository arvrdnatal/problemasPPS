package problema01;

import java.util.Iterator;
import java.util.List;

public class FormulaPonderada implements Formula {
    @Override
    public double calcularMedia(List<Nota> notas) {
        double somatorio = 0;
        double pesos = 0;

        for(Nota nota : notas){
            somatorio += nota.getValor() * nota.getPeso();
            pesos += nota.getPeso();
        }

        return somatorio / pesos;
    }
}

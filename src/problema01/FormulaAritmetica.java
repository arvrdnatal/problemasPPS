package problema01;

import java.util.Iterator;
import java.util.List;

public class FormulaAritmetica implements Formula {
    @Override
    public double calcularMedia(List<Nota> notas) {
        double somatorio = 0;

        for(Nota nota : notas){
            somatorio += nota.getValor();
        }

        return somatorio / notas.size();
    }
}

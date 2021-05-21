package problema01;

import java.util.List;

public class CalculadorDeMedias {
    // primeiro jeito: implementando Formula no método
    /*public double calcularMedia(List<Nota> notas, Formula formula) {
        return formula.calcularMedia(notas);
    }*/


    // segundo jeito: implementando Formula na classe
    private Formula formula;

    public CalculadorDeMedias(Formula formula) {
        this.formula = formula;
    }

    public double calcularMedia(List<Nota> notas) {
        return this.formula.calcularMedia(notas);
    }

    public void setFormula(Formula formula) {
        this.formula = formula;
    }
}

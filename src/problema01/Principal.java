package problema01;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Nota> notas = new ArrayList<>();

        // testes:
        notas.add(new Nota(10, 5));
        notas.add(new Nota(2, 2));
        notas.add(new Nota(6, 1));
        notas.add(new Nota(7, 2));

        //Formula aritmetica = new FormulaAritmetica();
        //Formula ponderada = new FormulaPonderada();

        // primeiro jeito:
        /*CalculadorDeMedias calculadorDeMedias = new CalculadorDeMedias();
        double media = calculadorDeMedias.calcularMedia(notas, new FormulaAritmetica()); // resultado = 6,25
        System.out.println(media);
        media = calculadorDeMedias.calcularMedia(notas, new FormulaPonderada()); // resultado = 7,4
        System.out.println(media);*/

        // segundo jeito:
        CalculadorDeMedias calculadorDeMedias = new CalculadorDeMedias(new FormulaAritmetica());
        double media = calculadorDeMedias.calcularMedia(notas); // resultado = 6,25
        System.out.println(media);
        calculadorDeMedias.setFormula(new FormulaPonderada());
        media = calculadorDeMedias.calcularMedia(notas); // resultado = 7,4
        System.out.println(media);
    }
}

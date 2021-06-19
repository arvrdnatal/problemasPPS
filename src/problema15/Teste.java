package problema15;

public class Teste {
    public static void main(String[] args) {
        // 1. desenhar um círculo
        Forma circulo = new Circulo(10);
        System.out.println(circulo.desenhar());

        // 2. aplicar largura na linha de borda
        Decorador linha = new Linha(0.2, circulo);
        System.out.println(linha.desenhar());

        // 3. aplicar cor na linha de borda
        Decorador corLinha = new Cor("verde", linha);
        System.out.println(corLinha.desenhar());

        // 3.5. aplicar cor na forma
        Decorador corForma = new Cor("azul", circulo);
        System.out.println(corForma.desenhar());

        // 4. aplicar cor no preenchimento
        Decorador preenchimento = new Preenchimento(circulo);
        System.out.println(preenchimento.desenhar());
    }
}

package problema05;

public class Teste {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(100.0);
        orcamento.aprovar();
        System.out.println(orcamento.getEstado());
        orcamento.aprovar();
    }
}

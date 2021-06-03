package problema12v2;

public class Teste {
    public static void main(String[] args) {
        Diretorio NovaPasta = new Diretorio("Nova Pasta");
        Diretorio OutraPasta = new Diretorio("Outra Pasta");
        Elemento Arquivo = new Arquivo("Arquivo");

        NovaPasta.adicionar(OutraPasta);
        OutraPasta.adicionar(Arquivo);

        System.out.println(NovaPasta.exibir());
    }
}

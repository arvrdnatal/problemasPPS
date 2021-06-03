package problema12v1;

public class Teste {
    public static void main(String[] args) {
        Elemento NovaPasta = new Diretorio("Nova Pasta");
        Elemento OutraPasta = new Diretorio("Outra Pasta");
        Elemento Arquivo = new Arquivo("Arquivo");

        NovaPasta.adicionarElemento(OutraPasta);
        Arquivo.adicionarElemento(OutraPasta);
        OutraPasta.adicionarElemento(Arquivo);
    }
}

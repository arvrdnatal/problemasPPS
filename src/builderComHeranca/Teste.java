package builderComHeranca;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new PessoaBuilder("ze", "email@email")
                .setTelefone("1234")
                .constroi();
    }
}

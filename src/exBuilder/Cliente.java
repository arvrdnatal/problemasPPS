package exBuilder;

public class Cliente {
    public static void main(String[] args) {
        // BUILDER ANINHADO
        Funcionario funcionario = new Funcionario.FuncionarioBuilder("Ana", "Silva", 33, 7)
                .setEmail("exemplo")
                .setEndereco("rua tal")
                .setFone("12354")
                .build();
    }
}

package grupoZap;

public class Teste {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("ze");
        Usuario u2 = new Usuario("ana");

        Grupo grupo = Grupo.criarGrupo("familia");

        grupo.adicionar(u1);
        grupo.adicionar(u2);

        grupo.novaMensagem("Olá", u1);
    }
}

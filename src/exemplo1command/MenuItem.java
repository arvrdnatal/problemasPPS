package exemplo1command;

public class MenuItem {
    private Acao acao;

    public MenuItem(Acao acao) {
        this.acao = acao;
    }

    public void clicar() {
        acao.executar();
    }
}

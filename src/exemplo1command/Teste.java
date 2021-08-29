package exemplo1command;

public class Teste {
    public static void main(String[] args) {
        BarraMenu barra = new BarraMenu();

        MenuItem itemCopiar = new MenuItem(new AcaoCopiar());
        MenuItem itemColar = new MenuItem(new AcaoColar());

        barra.adicionar(itemColar);
        barra.adicionar(itemCopiar);

        itemColar.clicar();
        itemCopiar.clicar();

        Macro macro = new Macro();
        macro.adicionarAcao(new AcaoCopiar());
        macro.adicionarAcao(new AcaoColar());
        macro.executar();

        MenuItem menuTeste = new MenuItem(macro);
        menuTeste.clicar();
    }
}

package factoryE1;

public class BudFabrica implements CervejaFabrica {
    @Override
    public Cerveja criarCerveja() {
        return new Bud("Bud");
    }
}

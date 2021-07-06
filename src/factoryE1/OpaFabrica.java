package factoryE1;

public class OpaFabrica implements CervejaFabrica {
    @Override
    public Cerveja criarCerveja() {
        Opa opa = new Opa();
        opa.setNome("Opa");
        return opa;
    }
}

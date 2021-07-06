package singleton;

public class Teste {
    // primeira forma
    //Escola escola = Escola.INSTANCE;

    // segunda e terceira forma
    Escola escola = Escola.getInstance();

    // com enum
    EscolaEnum escolaEnum = EscolaEnum.INSTANCE;
}

package orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calculadoraDeImposto(Orcamento orcamento, Imposto imposto){
        return imposto.calcularImposto(orcamento);
    }
}

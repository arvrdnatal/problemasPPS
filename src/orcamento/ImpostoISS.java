package orcamento;

import java.math.BigDecimal;

public class ImpostoISS implements Imposto {
    @Override
    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.2"));
    }
}

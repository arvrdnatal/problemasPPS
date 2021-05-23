package orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcularImposto(Orcamento orcamento);
}

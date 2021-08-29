package exemplo1command;

import java.util.ArrayList;
import java.util.List;

public class Macro implements Acao{
    private List<Acao> acoes;

    public Macro() {
        this.acoes = new ArrayList<>();
    }

    public void adicionarAcao(Acao acao) {
        acoes.add(acao);
    }

    @Override
    public void executar() {
        System.out.println("executando ações macro");
        for(Acao acao : acoes) {
            acao.executar();
        }
    }
}

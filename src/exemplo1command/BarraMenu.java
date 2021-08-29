package exemplo1command;

import java.util.ArrayList;
import java.util.List;

public class BarraMenu {
    private List<MenuItem> itens;

    public BarraMenu() {
        this.itens = new ArrayList<>();
    }

    public void adicionar(MenuItem menu) {
        itens.add(menu);
    }
}

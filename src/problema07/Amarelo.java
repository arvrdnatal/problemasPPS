package problema07;

public class Amarelo implements Estado {
    @Override
    public void mudar(Sinaleira sinaleira) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sinaleira.setEstado(new Vermelho());
    }

    @Override
    public String getEstado() {
        return "Amarelo";
    }
}

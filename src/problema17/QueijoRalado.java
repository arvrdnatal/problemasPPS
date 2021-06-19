package problema17;

public class QueijoRalado extends Complemento {
    public QueijoRalado(Comida comida, float preco) {
        super(preco, comida);
    }

    @Override
    public float preco() {
        return this.comida.preco() + this.preco;
    }
}

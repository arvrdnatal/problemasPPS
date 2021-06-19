package problema17;

public class BatataPalha extends Complemento {
    public BatataPalha(Comida comida, float preco) {
        super(preco, comida);
    }

    @Override
    public float preco() {
        return this.comida.preco() + this.preco;
    }
}

package problema03;

public class Main {
    public static void main(String[] args) {
        // testes:
        PersonagemA pa = new PersonagemA(new PuloBaixo(), new RolamentoLateral());
        pa.chutar();
        pa.pular();
        pa.setPulo(new PuloAlto());
        pa.pular();
    }
}

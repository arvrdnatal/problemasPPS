package problema04;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private Cargo cargo;

    public Funcionario(String nome, double salarioBase, Cargo cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double calcularSalarioComBonificacao() {
        return this.getSalarioBase() * (1 + this.getCargo().getBonificacao());
    }

    public double calcularSalarioComBonificacaoEspecial(Bonus bonus) {
        return bonus.calcularBonus(this);
    }
}

package problema13;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("ADS");
        Modulo m1 = new Modulo("1º Semestre");
        Modulo m2 = new Modulo("2º Semestre");
        Disciplina d1 = new Disciplina("Matemática", 40);
        Disciplina d2 = new Disciplina("POO", 40);
        Disciplina d3 = new Disciplina("Práticas I", 40);
        Disciplina d4 = new Disciplina("Práticas II", 40);

        curso.adicionarModulos(m1);
        curso.adicionarModulos(m2);
        m1.adicionarDisciplina(d1);
        m1.adicionarDisciplina(d2);
        m1.adicionarDisciplina(d3);
        m2.adicionarDisciplina(d4);

        //curso.exibir();

        d4.concluir();
        //curso.exibir();

        d1.concluir();
        d2.concluir();
        //curso.exibir();

        d3.concluir();
        curso.exibir();
    }
}

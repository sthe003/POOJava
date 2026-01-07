package br.com.polimorfismo.aluno;

public class Principal {
    public static void main(String[] args) {
    FichaAluno meuAluno = new FichaAluno();
    meuAluno.setNome("Rafael");
    meuAluno.setNota1(1);
    meuAluno.setNota2(1);
    meuAluno.setNota3(9);
    meuAluno.verificarNotas();
    }
}

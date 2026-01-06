package br.com.polimorfismo.idade;

public class Principal {
    public static void main(String[] args) {
        IdadePessoa minhaPessoa = new IdadePessoa();
        minhaPessoa.setNome("Rafael");
        minhaPessoa.setIdade(10);
        minhaPessoa.verificarIdade();
    }
}

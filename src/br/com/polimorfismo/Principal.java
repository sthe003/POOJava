package br.com.polimorfismo;

public class Principal {
    public static void main(String[] args) {

        Carro onix = new Carro();
        onix.setNome("Onix");
        onix.setCor("Prata");
        onix.setAnoInicial(2020);
        onix.setAnoAtual(2025);
        onix.setPrecoInicial(80.000);

        onix.fichaTecnica();

    }
}

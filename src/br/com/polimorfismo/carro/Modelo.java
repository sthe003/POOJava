package br.com.polimorfismo.carro;

public class Modelo{
    private String nome;
    private String cor;
    private int anoAtual;
    private double precoInicial;
    private int anoInicial;
    private double taxaDesvalorizacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrecoInicial() {
        return precoInicial;
    }

    public void setPrecoInicial(double precoInicial) {
        this.precoInicial = precoInicial;
    }

    public int getAnoInicial() {
        return anoInicial;
    }

    public void setAnoInicial(int anoInicial) {
        this.anoInicial = anoInicial;
    }

    public double getTaxaDesvalorizacao() {
        return taxaDesvalorizacao;
    }

    public void setTaxaDesvalorizacao(double taxaDesvalorizacao) {
        this.taxaDesvalorizacao = taxaDesvalorizacao;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public double calcularPreco(){
        double taxaDesvalorizacao = 0.10;
        int anos = anoAtual - anoInicial;
        double precoAtual = precoInicial;
        for (int i = 0; i < anos; i++){
            precoInicial -= precoInicial * taxaDesvalorizacao;
        }
        return precoInicial;
    }

    public void fichaTecnica(){
        System.out.println(nome);
        System.out.println(cor);
        System.out.println(anoInicial);
        System.out.println(calcularPreco());
    }
}

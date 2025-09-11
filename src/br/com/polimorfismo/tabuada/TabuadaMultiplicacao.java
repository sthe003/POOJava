package br.com.polimorfismo.tabuada;

public class TabuadaMultiplicacao implements Tabuada{
   private int numero1;
   private int numero2;
   private int resultado;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public void mostrarTabuda() {
        for(int numero1 = 2; numero1 <= 10; numero1++){
            for (int numero2 = 1; numero2 <= 10; numero2++){
                resultado = numero1 * numero2;
                System.out.println(numero1 + "x" + numero1 + "=" + resultado);
            }

        }
    }
}

package br.com.polimorfismo.animais;

public class Principal {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.emitirSom();
        meuCachorro.abanarRabo();

        Gato meuGato = new Gato();
        meuGato.emitirSom();
        meuGato.arranharMoveis();
    }
}

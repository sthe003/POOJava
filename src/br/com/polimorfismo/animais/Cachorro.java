package br.com.polimorfismo.animais;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("auau");;
    }

    public void abanarRabo(){
        System.out.println("O cachorro está abanando o rabo!");
    }
}

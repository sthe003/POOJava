package br.com.polimorfismo.animais;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("miau");
    }

    public void arranharMoveis(){
        System.out.println("O gato está arranhando o sofá!");
    }
}

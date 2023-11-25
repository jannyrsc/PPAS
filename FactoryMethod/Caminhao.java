package FactoryMethod;

//produtos concretos
public class Caminhao implements InterfaceTransporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por caminhão.");
    }
}

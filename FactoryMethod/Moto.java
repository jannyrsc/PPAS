package FactoryMethod;

//produtos concretos
public class Moto implements InterfaceTransporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por moto");
    }
}

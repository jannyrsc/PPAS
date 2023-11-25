package FactoryMethod;

//produtos concretos
public class Navio implements InterfaceTransporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por transporte marítimo.");
    }
}

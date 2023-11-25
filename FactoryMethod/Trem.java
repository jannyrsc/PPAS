package FactoryMethod;

//produtos concretos
public class Trem implements InterfaceTransporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por transporte ferroviário.");
    }
}

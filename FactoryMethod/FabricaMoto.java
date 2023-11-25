package FactoryMethod;

//criador concreto
public class FabricaMoto implements InterfaceFabricaTransporte {
    @Override
    public InterfaceTransporte criarTransporte() {
        return new Moto();
    }
}

package FactoryMethod;

//criador concreto
public class FabricaNavio implements InterfaceFabricaTransporte {
    @Override
    public InterfaceTransporte criarTransporte() {
        return new Navio();
    }
}

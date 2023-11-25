package FactoryMethod;

//criador concreto
public class FabricaCaminhao implements InterfaceFabricaTransporte {
    @Override
    public InterfaceTransporte criarTransporte() {
        return new Caminhao();
    }
}

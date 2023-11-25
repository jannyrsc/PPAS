package FactoryMethod;

//criador concreto
public class FabricaTrem implements InterfaceFabricaTransporte {
    @Override
    public InterfaceTransporte criarTransporte() {
        return new Trem();
    }
}

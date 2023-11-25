package FactoryMethod;

public class Logistica {
    public void planejarEntrega(String modo) {
        InterfaceFabricaTransporte fabrica;

        if (modo.equalsIgnoreCase("caminhao")) {
            fabrica = new FabricaCaminhao();
        } else if (modo.equalsIgnoreCase("navio")) {
            fabrica = new FabricaNavio();
        } else if (modo.equalsIgnoreCase("trem")) {
            fabrica = new FabricaTrem();
        } else if (modo.equalsIgnoreCase("moto")) {
            fabrica = new FabricaMoto();
        } else {
            throw new IllegalArgumentException("Modo de transporte inválido.");
        }

        InterfaceTransporte transporte = fabrica.criarTransporte();
        transporte.entregar();
    }
}

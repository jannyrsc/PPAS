package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Logistica logistica = new Logistica();

        logistica.planejarEntrega("caminhao");
        logistica.planejarEntrega("navio");
        logistica.planejarEntrega("trem");
        logistica.planejarEntrega("moto");
    }
}

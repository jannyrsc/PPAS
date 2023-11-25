package Singleton;

public class Test {
    public static void main(String[] args) {
        FabricaDeCarro fabrica = FabricaDeCarro.getInstance();
        fabrica.criarCarroFiat();
        fabrica.criarCarroFord();
        fabrica.criarCarroVolks();
        fabrica.gerarRelatorio();

    }
}

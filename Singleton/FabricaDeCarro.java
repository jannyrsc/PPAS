package Singleton;

public class FabricaDeCarro {
    private static FabricaDeCarro instance;
    private int numCarrosProduzidos;

    protected FabricaDeCarro(){
        numCarrosProduzidos=0;
    }

    public static FabricaDeCarro getInstance(){
        if (instance == null){
            instance = new FabricaDeCarro();
        }
        return instance;
    }

    public void criarCarroFiat(){
        System.out.println("Criando um carro Fiat");
        numCarrosProduzidos++;
    }

    public void criarCarroFord(){
        System.out.println("Criando um carro Ford");
        numCarrosProduzidos++;
    }

    public void criarCarroVolks(){
        System.out.println("Criando um carro Volks");
        numCarrosProduzidos++;
    }

    public void gerarRelatorio(){
        System.out.println("Relatorio: quantidade de carros produzidos: " +numCarrosProduzidos);
    }
}

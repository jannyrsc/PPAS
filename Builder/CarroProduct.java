package Builder;

public class CarroProduct {
    double preco;
    String dscMotor;
    int anoDeFabricacao;
    String modelo;
    String montadora;

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void calcularPreco(){
        int anoAtual = 2023;
        int idade = anoAtual - this.anoDeFabricacao;

        // Vamos supor um valor base e uma desvalorização por ano de 1000 reais
        double valorBase = 25000.00;
        double desvalorizacaoPorAno = 1000.00;

        // Cálculo do preço
        this.preco = valorBase - (desvalorizacaoPorAno * idade);
    }

}

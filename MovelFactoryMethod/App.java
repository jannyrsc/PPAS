package MovelFactoryMethod;

public class App {
    public static void main(String[] args) {

        IMovelFactory fabricaModerna = new FabricaModerna();
        IMovelFactory fabricaVitoriana = new FabricaVitoriana();
        IMovelFactory fabricaArtDeco = new FabricaArtDeco();


        IMovel cadeiraModerna = fabricaModerna.createMovel("Cadeira");
        IMovel mesaModerna = fabricaModerna.createMovel("MesaDeCentro");
        IMovel sofaModerno = fabricaModerna.createMovel("Sofa");
        IMovel cadeiraVitoriana = fabricaVitoriana.createMovel("Cadeira");
        IMovel mesaVitoriana = fabricaVitoriana.createMovel("MesaDeCentro");
        IMovel sofaVitoriano = fabricaVitoriana.createMovel("Sofa");
        IMovel cadeiraArtDeco = fabricaArtDeco.createMovel("Cadeira");
        IMovel mesaArtDeco = fabricaArtDeco.createMovel("MesaDeCentro");
        IMovel sofaArtDeco = fabricaArtDeco.createMovel("Sofa");

        cadeiraModerna.estilo();
        mesaModerna.estilo();
        sofaModerno.estilo();
        System.out.println();

        cadeiraVitoriana.estilo();
        mesaVitoriana.estilo();
        sofaVitoriano.estilo();
        System.out.println();

        cadeiraArtDeco.estilo();
        mesaArtDeco.estilo();
        sofaArtDeco.estilo();
    }
}
package AbstractFactory;

public class FabricaArtDeco implements IMovelFactory{

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraArtDeco();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaArtDeco();
    }

    @Override
    public MesaDeCentro criarMesaDeCentro() {
        return new MesaDeCentroArtDeco();
    }
}

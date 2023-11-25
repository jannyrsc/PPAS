package MovelFactoryMethod;

//criador concreto
public class FabricaArtDeco implements IMovelFactory {

    @Override
    public IMovel createMovel(String tipo){
        switch (tipo) {
            case "Cadeira":
                return new CadeiraArtDeco();
            case "Sofa":
                return new SofaArtDeco();
            case "MesaDeCentro":
                return new MesaDeCentroArtDeco();
            default:
                throw new IllegalArgumentException("Tipo de móvel desconhecido: " + tipo);
        }
    }

}


package MovelFactoryMethod;

//criador concreto
public class FabricaModerna implements IMovelFactory {

    @Override
    public IMovel createMovel(String tipo){
        switch (tipo) {
            case "Cadeira":
                return new CadeiraModerna();
            case "Sofa":
                return new SofaModerno();
            case "MesaDeCentro":
                return new MesaDeCentroModerna();
            default:
                throw new IllegalArgumentException("Tipo de móvel desconhecido: " + tipo);
        }
    }

}

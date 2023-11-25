package MovelFactoryMethod;

//criador base
public interface IMovelFactory {
    IMovel createMovel(String modelo);
}

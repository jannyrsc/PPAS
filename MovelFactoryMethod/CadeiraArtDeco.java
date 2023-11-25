package MovelFactoryMethod;

//produtos concretos
public class CadeiraArtDeco implements IMovel {

    @Override
    public void estilo() {
        System.out.println("Cadeira Art Deco");
    }
}


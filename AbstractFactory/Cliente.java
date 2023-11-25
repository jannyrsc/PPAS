package AbstractFactory;

public class Cliente {
    public static void main(String[] args) {
                IMovelFactory fabrica = new FabricaModerna();
                IMovelFactory fabrica1 = new FabricaVitoriana();
                IMovelFactory fabrica2 = new FabricaArtDeco();

                Cadeira cadeiraModerna = fabrica.criarCadeira();
                Cadeira cadeiraVitoriana = fabrica1.criarCadeira();
                Cadeira cadeiraArtDeco = fabrica2.criarCadeira();

                cadeiraModerna.exibirInformacaoCadeira();
                cadeiraVitoriana.exibirInformacaoCadeira();
                cadeiraArtDeco.exibirInformacaoCadeira();
                System.out.println();

                Sofa sofaModerno = fabrica.criarSofa();
                Sofa sofaVitoriano = fabrica1.criarSofa();
                Sofa sofaArtDeco = fabrica2.criarSofa();

                sofaModerno.exibirInformacaoSofa();
                sofaVitoriano.exibirInformacaoSofa();
                sofaArtDeco.exibirInformacaoSofa();
                System.out.println();

                MesaDeCentro mesaDeCentroModerna = fabrica.criarMesaDeCentro();
                MesaDeCentro mesaDeCentroVitoriana = fabrica1.criarMesaDeCentro();
                MesaDeCentro mesaDeCentroArtDeco = fabrica2.criarMesaDeCentro();

                mesaDeCentroModerna.exibirInformacaoMesaDeCentro();
                mesaDeCentroVitoriana.exibirInformacaoMesaDeCentro();
                mesaDeCentroArtDeco.exibirInformacaoMesaDeCentro();
                System.out.println();
            }
        }
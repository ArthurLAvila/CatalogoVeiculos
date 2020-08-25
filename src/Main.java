public class Main {

    public static void main(String[] args) {

        Catalogo MeuCatalogoA;
        Veiculo MeuVeiculo;

        System.out.println("Inicio");

        MeuCatalogoA = new Catalogo(10);

        MeuVeiculo = new Veiculo("Toyota", "Yarris", 1000, 10);
        MeuCatalogoA.setVeiculo(MeuVeiculo);

        MeuVeiculo = new Veiculo("Toyota", "Corolla", 10000, 100);
        MeuCatalogoA.setVeiculo(MeuVeiculo);

        MeuVeiculo = new Veiculo("Toyota", "Hylux", 2000, 20);
        MeuCatalogoA.setVeiculo(MeuVeiculo);

        System.out.print(MeuCatalogoA.DescCatalogo());

        System.out.println("Fim");

    }
}

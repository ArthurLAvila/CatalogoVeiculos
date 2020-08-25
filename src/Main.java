public class Main {

    public static void main(String[] args) {

        Catalogo MeuCatalogoA;

        Veiculo MeuVeiculo;

        MeuVeiculo = new Veiculo("Toyota", "Yarris", 1000, 10);

        MeuCatalogoA = new Catalogo(10);

        MeuCatalogoA.setVeiculo(MeuVeiculo);

        System.out.print("Fim");

    }
}

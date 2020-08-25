public class Veiculo {

    private String Marca;
    private String Modelo;
    private int Preco;
    private int Quantidade;

    public Veiculo(String Marca, String Modelo, int Preco, int Quantidade) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Preco = Preco;
        this.Quantidade = Quantidade;
    }

    public void setPreco(int Preco) {
        this.Preco = Preco;
    }

    public int getPreco() {
        return this.Preco;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getQuantidade() {
        return this.Quantidade;
    }

    public String DescVeiculo() {
        return this.Marca + ' ' + this.Modelo + ' ' + this.Preco + ' ' + this.Quantidade;
    }

}

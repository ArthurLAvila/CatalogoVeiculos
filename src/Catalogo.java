public class Catalogo {

    private Veiculo MeuCatalogo [];
    int Quantidade;

    public Catalogo(int Tamanho) {
        this.MeuCatalogo = new Veiculo[Tamanho];
        this.Quantidade = 0;
    }

    public void setVeiculo(Veiculo NovoVeiculo) {
        this.MeuCatalogo[this.Quantidade] = NovoVeiculo;
        this.Quantidade = this.Quantidade + 1;
    }

    public Veiculo getVeiculo(int Posicao) {
        if (Posicao < this.Quantidade) {
            return this.MeuCatalogo[Posicao];
        }
        else {
            return null;
        }
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getQuantidade() {
        return this.Quantidade;
    }

    public String DescCatalogo() {

        String ListaCatalogo = null;

        for (int i=0; i<this.Quantidade; i++) {
            ListaCatalogo = ListaCatalogo + MeuCatalogo[i].DescVeiculo();
            ListaCatalogo = ListaCatalogo + '\n';
        }

        return ListaCatalogo;
    }

}

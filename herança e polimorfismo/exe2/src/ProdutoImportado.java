public class ProdutoImportado extends Produto{
    private double taxaImposto;

    public ProdutoImportado(double preco, String nome, double taxaImposto) {
        super(preco, nome);
        this.taxaImposto = taxaImposto;
    }

    public double getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }
    public double calculaImposto() {
        return getPreco() * (1+taxaImposto);
    }
    @Override
    public final String precoTag(){
        return  getNome()+"\n"+String.format("%.2f",calculaImposto());
    }
}

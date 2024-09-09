public class Poupanca extends Conta {
    private Double taxaDeJuros;

    public Poupanca(String usuario, String numero, double saldo, Double taxaDeJuros) {
        super(usuario, numero, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    public void atualizaTaxaDeJuros(Double valor) {
        this.saldo+= saldo* valor;
    }
    @Override
    public void sacar(double valor) {
        saldo-=valor;
    }
}

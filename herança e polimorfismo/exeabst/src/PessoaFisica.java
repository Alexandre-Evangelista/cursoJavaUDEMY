public class PessoaFisica extends Pessoa {
    private double gastoSaude;

    public PessoaFisica(String nome, double reandaAnual, double gastoSaude) {
        super(nome, reandaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double calcularImposto() {
        double soma;
        if(getReandaAnual()<20000.0){
            soma=getReandaAnual()*0.15-(getGastoSaude()*0.5);
        }else{
            soma=getReandaAnual()*0.25-(getGastoSaude()*0.5);
        }
    return soma;}
}

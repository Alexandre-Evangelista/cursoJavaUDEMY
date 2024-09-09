public class PessoaJuridica extends Pessoa{
    private int numFuncionarios;

    public PessoaJuridica(String nome, double reandaAnual, int numFuncionarios) {
        super(nome, reandaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double calcularImposto() {
        double soma;
        if(numFuncionarios<10){
            soma=getReandaAnual()*0.16;
        }else{
            soma=getReandaAnual()*0.14;
        }
        return soma;
    }
}

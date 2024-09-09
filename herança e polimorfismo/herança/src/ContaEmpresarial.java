public class ContaEmpresarial extends Conta{
    private Double emprestimo;

    public ContaEmpresarial(String usuario, String numero, double saldo, double emprestimo) {
        super(usuario, numero, saldo);
        this.emprestimo = emprestimo;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }
    public void fazerEmprestimo(double x){
        emprestimo+=1.15*x;
    }
    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        saldo-=2.0;
    }
}

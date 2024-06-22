public class ContaBancaria {
    private String nome;
    private double saldo;
    private int numero;
    public ContaBancaria(String nome,double saldo,int numero){
        this.nome=nome;
        this.saldo=saldo;
        this.numero=numero;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void depositar(double valor){
        saldo+=valor;
    }
    public void sacar(double valor){
        saldo-=valor+5;
    }
    public void mostar(){
        System.out.println("conta "+numero+", titular "+nome+", saldo "+saldo);
    }

}

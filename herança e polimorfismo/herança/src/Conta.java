public class Conta {

    private String usuario;
    private String numero;
     double saldo;

    public Conta(String usuario, String numero, double saldo) {
        this.usuario = usuario;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
        saldo+=valor;
    }
    public void sacar(double valor) {
        saldo-=valor+5;
    }
}

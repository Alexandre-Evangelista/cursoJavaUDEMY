
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new PessoaFisica("ALEX",50000,2000);
        System.out.println(p1.calcularImposto());
        Pessoa p2 = new PessoaJuridica("BELA",400000,25);
        System.out.println(String.format("%.2f",p2.calcularImposto()));

    }
}
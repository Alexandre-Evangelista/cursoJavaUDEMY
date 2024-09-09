
public class Main {
    public static void main(String[] args) {
    ContaEmpresarial conta =new ContaEmpresarial("alexandre","1111",5000,0);
    System.out.println(conta.getSaldo());
    conta.depositar(5000);
    System.out.println(conta.getSaldo());
    conta.sacar(9000);
    System.out.println(conta.getSaldo());
    conta.fazerEmprestimo(5000);
    System.out.println(conta.getEmprestimo());
        System.out.println("\n\n\n");
        Conta conta1 = new ContaEmpresarial("roberto","2111",10000,1000);

        //UPCASTING
        Conta conta2 = conta1;
        Conta conta3 = new Poupanca("bob","3333",40000,5000.00);

        //DOWNCASTING nem todo downcasting da certo
        ContaEmpresarial conta4 =(ContaEmpresarial) conta2;
        // erro
        if (conta3 instanceof ContaEmpresarial){
            ContaEmpresarial conta5 = (ContaEmpresarial) conta3;
            conta5.fazerEmprestimo(2000);
            System.out.println("emprestimo de saldo: "+conta1.getSaldo());


        }else{
            System.out.println("falhou");
        }

        //sobreposicao
         Conta conta5 = new Poupanca("maria","4444",10000,0.01);
        conta5.sacar(200);
        System.out.println(conta5.getSaldo());

        Conta conta6 = new Conta("alex","5555",10000);
        conta6.sacar(200);
        System.out.println(conta6.getSaldo());
        //super
        Conta conta7 = new ContaEmpresarial("roberto","2222",10000,5000);
        conta7.sacar(200);
        System.out.println(conta7.getSaldo());
    }
}
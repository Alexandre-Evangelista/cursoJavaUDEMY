import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ContaBancaria conta= new ContaBancaria("alex", 500,8532);
        conta.mostar();
        System.out.println("quanto deseja depositar na conta");
        double deposito = entrada.nextDouble();
        conta.depositar(deposito);
        conta.mostar();
        System.out.println("quanto deseja sacar");
        double sacar= entrada.nextDouble();
        conta.sacar(sacar);
        conta.mostar();





        entrada.close();


    }
}
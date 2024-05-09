import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int numero;
        Scanner entrada= new Scanner(System.in);
        System.out.println("digite um numero inteiro");
        numero= entrada.nextInt();
        if (numero%2==0){
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }

    }

}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        int horas,numero;
        double valorHora;
        Scanner scanner= new Scanner(System.in);
        numero= scanner.nextInt();
        horas= scanner.nextInt();
        valorHora= scanner.nextDouble();
        double salario= horas*valorHora;
        System.out.println(numero);
        System.out.println(salario);
    }

}
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe quantos reais deseja converter");
        double valor= entrada.nextDouble();
        System.out.println(Corretora.DOLLAR);
        System.out.println(Corretora.converter(valor));

    }
}
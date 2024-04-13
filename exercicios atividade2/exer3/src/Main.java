import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double num1,num2,conta;
        Scanner entrada= new Scanner(System.in);
        System.out.println("digite os numeros");
        num1= entrada.nextDouble();
        num2= entrada.nextDouble();
        if (num1>num2){
            if (num1%num2==0){
                System.out.println("sao multiplos");
            }else {
                System.out.println("nao sao multiplos");
            }
        }else {
            if (num2%num1==0){
                System.out.println("sao multiplos");
            }else {
                System.out.println("nao sao multiplos");
        }
        }


    }

}
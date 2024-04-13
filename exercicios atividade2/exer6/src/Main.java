import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double valor;
        Scanner entrada= new Scanner(System.in);
        System.out.println("informe um valor");
        valor =entrada.nextDouble();
        if (0<valor && valor<25){
            System.out.println("no intervalo (0,25]");
        } else if (25.1<valor && valor<50){
            System.out.println("no intervalo (50,75]");
        }else if (50.1<valor && valor<75){
            System.out.println("no intervalo (75,100]");
        }else {
            System.out.println("fora do intervalo");
        }





    }


}
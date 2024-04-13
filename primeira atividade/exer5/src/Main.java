import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int codP1,codP2,quantP1,quantP2;
        double valP1,valP2;
        Scanner entrada= new Scanner(System.in);
        System.out.println("digite os codigo das peças");
        codP1=entrada.nextInt();
        codP2=entrada.nextInt();
        System.out.println("informe as quantidades");
        quantP1= entrada.nextInt();
        quantP2= entrada.nextInt();
        System.out.println("informe o preco de cada peça");
        valP1= entrada.nextDouble();
        valP2= entrada.nextDouble();
        double total= quantP1*valP1+quantP2*valP2;
        System.out.println("o valor e de "+ total);
    }

}
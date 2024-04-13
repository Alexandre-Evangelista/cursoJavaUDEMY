import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double a,b,c;
        Scanner entrada= new Scanner(System.in);
        a=entrada.nextDouble();
        b=entrada.nextDouble();
        c=entrada.nextDouble();
        double triangulo= a*c/2;
        double circulo= 3.14*c*c;
        double trapezio= (a+b)*c/2;
        double quadrado= b*b;
        double retangulo= a*b;
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(trapezio);
        System.out.println(quadrado);
        System.out.println(retangulo);


    }

}
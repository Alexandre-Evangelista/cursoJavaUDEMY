import java.util.Scanner;

public class Main {
    public static double Perimetro(double a,double b, double c){
        return (a+b+c)/2;
    }
    public static double Area(double p,double a,double b, double c){
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("informe lados do primeiro triangulo");
        double lado1Tri1 = entrada.nextDouble();
        double lado2Tri1 = entrada.nextDouble();
        double lado3Tri1 = entrada.nextDouble();
        System.out.println("informe lados do segundo triangulo");
        double lado1Tri2 = entrada.nextDouble();
        double lado2Tri2 = entrada.nextDouble();
        double lado3Tri2 = entrada.nextDouble();
        double p = Perimetro(lado2Tri1,lado1Tri1,lado3Tri1);
        double x = Perimetro(lado2Tri2,lado1Tri2,lado3Tri2);
        System.out.println(Area(p,lado1Tri1,lado2Tri1,lado3Tri1));
        System.out.println(Area(x,lado1Tri2,lado2Tri2,lado3Tri2));

        entrada.close();
    }
}
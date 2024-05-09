import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Triangulo x = new Triangulo();
        Triangulo y= new Triangulo();

        Scanner entrada = new Scanner(System.in);
        System.out.println("informe lados do primeiro triangulo");
        x.lado1 =entrada.nextDouble();
        x.lado2 = entrada.nextDouble();
        x.lado3= entrada.nextDouble();
        System.out.println("informe lados do segundo triangulo");
        y.lado1 = entrada.nextDouble();
        y.lado2 = entrada.nextDouble();
        y.lado3 = entrada.nextDouble();
        System.out.println(x.area(x.lado1, x.lado2,x.lado3));
        System.out.println(y.area(y.lado1, y.lado2, y.lado3));


        entrada.close();
    }
}
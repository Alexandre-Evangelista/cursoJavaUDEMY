import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo retangulo=new Retangulo();
        System.out.println("informe a altura e largura do retangulo");
        retangulo.altura=entrada.nextDouble();
        retangulo.largura=entrada.nextDouble();
        System.out.println("area");
        System.out.println(retangulo.area(retangulo.altura, retangulo.largura));
        System.out.println("perimetro");
        System.out.println(retangulo.perimetro(retangulo.altura, retangulo.largura));
        System.out.println("diagonal");
        System.out.println(retangulo.diagonal(retangulo.altura, retangulo.largura));
}
}

public class Main {
    public static void main(String[] args) {
        Corpo retangulo= new Retangulo(Cor.BLACK,4,5);
        System.out.println(retangulo.area());
        Corpo circulo= new Circulo(Cor.RED,3);
        System.out.println(circulo.area());

    }
}
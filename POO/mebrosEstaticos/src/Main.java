import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double raio=entrada.nextDouble();
        System.out.println(Calculador.cricuferencia(raio));
        System.out.println(Calculador.volume(raio));
        System.out.println(Calculador.PI);
        entrada.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);

        System.out.println("informe o total de pessoas");
        double soma=0;
        int numero= entrada.nextInt();
        double[]altura= new double[numero];
        for (int k=0;k<numero;k++){
            altura[k]=entrada.nextDouble();
            soma+=altura[k];
        }
        System.out.println(soma/numero);
     entrada.close();
    }
}
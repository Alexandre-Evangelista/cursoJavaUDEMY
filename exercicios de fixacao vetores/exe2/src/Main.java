import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double soma=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();
        double [] vetor= new double[numero];
        for (int i=0;i<vetor.length;i++){
            vetor[i]=entrada.nextDouble();
            soma+=vetor[i];
        }
        System.out.println(soma);
        System.out.println("a media e"+ soma/numero);
        entrada.close();
    }
}
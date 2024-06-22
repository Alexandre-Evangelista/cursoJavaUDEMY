import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();
        double soma=0;

        double [] vetor= new double[numero];

        for (int i=0;i<vetor.length;i++){
            System.out.println("informe o numero");
            vetor[i]=entrada.nextDouble();
            soma+=vetor[i];

        }
        double media=soma/numero;
        System.out.printf("media do vetor = %.3f %n",media);
        for (int i=0;i<vetor.length;i++){
            if (media>vetor[i]) {
                System.out.println(vetor[i]);
                }
            }



        entrada.close();
    }
}
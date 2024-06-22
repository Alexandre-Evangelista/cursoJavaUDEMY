import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();
        double soma=0;
        int cont=0;

        double [] vetor= new double[numero];

        for (int i=0;i<vetor.length;i++){
            System.out.println("informe o numero");
            vetor[i]=entrada.nextDouble();
            if (vetor[i]%2==0){
                soma+=vetor[i];
                cont++;
            }
            else if (soma==0 && i== vetor.length-1){
                System.out.println("nenhum numero par");
            }

        }
        if (soma!=0){
            System.out.printf("media dos pares %.1f%n",soma/cont);
        }

        entrada.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();

        double [] vetor1= new double[numero];
        double [] vetor2= new double[numero];
        double [] vetorResultante= new double[numero];
        for (int i=0;i<vetor1.length;i++){
            System.out.println("informe o numero");
            vetor1[i]=entrada.nextDouble();

        }
        for (int i=0;i<vetor2.length;i++){
            System.out.println("informe o numero");
            vetor2[i]=entrada.nextDouble();

        }
        for (int i=0;i<vetorResultante.length;i++){
            vetorResultante[i]= vetor1[i]+vetor2[i];
            System.out.println(vetorResultante[i]);
        }


        entrada.close();
    }
}
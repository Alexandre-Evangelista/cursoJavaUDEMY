import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();
        double [] vetor= new double[numero];
        for (int i=0;i<vetor.length;i++){
            vetor[i]=entrada.nextDouble();
        }
        for(int i=0;i<vetor.length;i++){
        if (vetor[i]<0){
            System.out.println(vetor[i]);
        }
       }

        entrada.close();
    }
}
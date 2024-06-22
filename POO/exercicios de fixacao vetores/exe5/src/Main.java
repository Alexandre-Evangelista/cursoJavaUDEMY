import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();
        double maior=0;
        int posicao=0;
        double [] vetor= new double[numero];
        for (int i=0;i<vetor.length;i++){
            System.out.println("informe o numero");
            vetor[i]=entrada.nextDouble();
            if (i==0){
                maior=vetor[i];
                posicao=i;
            }
            if (maior<vetor[i]){
                maior= vetor[i];
                posicao=i;
            }
        }
        System.out.printf("maior valor = %.2f %n",maior);
        System.out.printf("posição de maior valor = %d",posicao);


        entrada.close();
    }
}
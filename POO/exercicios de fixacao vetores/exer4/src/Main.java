import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();
        int cont=0;
        double [] vetor= new double[numero];
        for (int i=0;i<vetor.length;i++){
            System.out.println("informe o numero");
            vetor[i]=entrada.nextDouble();
        }
        for(int i=0;i<vetor.length;i++){
            if (vetor[i]%2==0){
                cont++;
                System.out.println(vetor[i]);
            }
        }
        System.out.printf("a quantidade de pares = %d",cont);
        entrada.close();
    }
}
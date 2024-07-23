import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("diga qual a ordem da matriz");
        int i = entrada.nextInt();
        int negativo=0;
        int [][] matriz= new int[i][i];
        for (int j=0;j<i;j++){
            for (int k=0;k<i;k++){
                System.out.printf("digite o numero da linha:%d coluna:%d%n",j,k);
                matriz[j][k]= entrada.nextInt();
            }
        }
        for (int j=0;j<matriz.length;j++){
            for (int k=0;k< matriz[j].length;k++){
                System.out.printf("%d ",matriz[j][k]);
                if (matriz[j][k]<0){
                    negativo++;
                }

            }
            System.out.printf("%n");
        }
        System.out.printf("diagonal da matriz ");
        for (int j=0;j<i;j++){
            System.out.printf("%d ",matriz[j][j]);
        }
        System.out.println("");
        System.out.printf("total de numeros negativos: %d%n",negativo);

    entrada.close();
    }
}
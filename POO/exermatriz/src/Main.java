import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("diga qual a ordem da matriz");
        int m = entrada.nextInt();
        int n =entrada.nextInt();
        int [][] matriz= new int[m][n];
        for (int j=0;j<m;j++){
            for (int k=0;k<n;k++){
                System.out.printf("digite o numero da linha:%d coluna:%d%n",j,k);
                matriz[j][k]= entrada.nextInt();
            }
        }
        System.out.println("digite o numero a procurar");
        int x= entrada.nextInt();

        for (int j=0;j<matriz.length;j++){
            for (int k=0;k< matriz[j].length;k++){
                if (matriz[j][k]==x) {
                    if (j!=0) {
                        System.out.println("A esquerda: "+matriz[j - 1][k]);
                    }
                    if (k!=0) {
                        System.out.println("Acima: "+matriz[j][k - 1]);
                    }
                    if (j!=m-1){
                        System.out.println("A direita: "+matriz[j + 1][k]);
                    }
                    if (k!=n-1) {
                        System.out.println("Abaixo: "+matriz[j][k + 1]);
                    }
                }else{
                    System.out.println("numero nao encontrado");}
            }

        }


        entrada.close();
    }
}
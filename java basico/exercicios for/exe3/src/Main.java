import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        for (int k=0;k<n;k++){
            double a = entrada.nextDouble();
            double b = entrada.nextDouble();
            double c = entrada.nextDouble();
            double mediaPon= (a*2+b*3+c*5)/10;
            System.out.println(mediaPon);


        }

        entrada.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        for (int k=1;k<=x;k++){
            if (k%2!=0){
                System.out.println(k);
            }
        }

        entrada.close();
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        for (int k =1;k<=n;k++){
            System.out.println(k+","+k*k+","+k*k*k);
        }
    }
}
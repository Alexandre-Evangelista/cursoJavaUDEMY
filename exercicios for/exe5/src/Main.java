import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int soma=1;
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        for (int k =1;k<=n;k++){
           soma*=k;
        }
        System.out.println(soma);
    }
}
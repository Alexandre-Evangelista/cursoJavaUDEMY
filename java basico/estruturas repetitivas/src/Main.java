import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int soma=0;
        while(x!=0){
            soma+=x;
            x = entrada.nextInt();

        }
        for (int k=1;k<=y;k++){
            System.out.println(k);
        }
        entrada.close();
    }
}
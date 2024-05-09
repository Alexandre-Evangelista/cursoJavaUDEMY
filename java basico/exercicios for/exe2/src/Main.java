import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int contIN=0; int contOut=0;
        for (int k=0;k<n;k++){
            int x = entrada.nextInt();
            if (x>=10 && x<=20){
                contIN++;
            }else {contOut++;}
        }
        System.out.println(contIN+" in");
        System.out.println(contOut+" out");

            entrada.close();
    }
}
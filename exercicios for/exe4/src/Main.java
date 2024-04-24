import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        for (int k =0;k<n;k++){
            System.out.println("informe os numeros");
            double num1 = entrada.nextDouble();
            double num2 = entrada.nextDouble();
            if (num2==0){
                System.out.println("divisão impossivel");
            }else{
                System.out.println(num1/num2);
            }
        }
    }
}
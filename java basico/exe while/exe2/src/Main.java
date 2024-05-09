import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        while(y!=0&&x!=0){

            if (y>0&&x>0){
                System.out.println("primeiro");
            } else if (y<0&&x>0) {
                System.out.println("quarto");
            } else if (y>0&&x<0) {
                System.out.println("segundo");
            }else {
                System.out.println("terceiro");
            }
            x = entrada.nextInt();
            y = entrada.nextInt();

        }
        entrada.close();
    }
}
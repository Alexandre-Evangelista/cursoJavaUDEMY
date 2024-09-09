import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    metodo1();
        System.out.println("fim do programa");
    }
    public static void metodo1(){
        System.out.println("*** metodo 1 start ***");
        metodo2();
        System.out.println("*** metodo 1 end ***");
    }
    public static void metodo2(){
        System.out.println("*** metodo 2 start ***");
        Scanner sc = new Scanner(System.in);

        try{
            String[] vetor=sc.nextLine().split(" ");
            System.out.println("informe a posiçao do vetor");
            int posicao= sc.nextInt();
            System.out.println(vetor[posicao]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERRO posiçao invalida");
            e.printStackTrace();
            sc.next();
        }catch (InputMismatchException e){
            System.out.println("valor invalido");
        }
        sc.close();
        System.out.println("*** metodo 2 end ***");
    }
}
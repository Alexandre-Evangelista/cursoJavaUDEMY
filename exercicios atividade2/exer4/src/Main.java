import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int horaCom,horasFin;
        Scanner entrada= new Scanner(System.in);
        System.out.println("digite a hora de começo e a hora de termino");
        horaCom= entrada.nextInt();
        horasFin= entrada.nextInt();
        if (horaCom>horasFin){
            int conta= 24- horaCom+horasFin;
            System.out.printf("o jogo durou %d horas",conta);
        }else if (horaCom==horasFin){
            System.out.printf("o jogo durou 24 horas");
        }else {
            int conta= horasFin-horaCom;
            System.out.printf("o jogo durou %d horas",conta);
        }


    }


}


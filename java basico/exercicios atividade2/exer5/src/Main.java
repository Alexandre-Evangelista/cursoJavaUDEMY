import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double quant;
        int num;
        int cachorroQuente= 4;
        double xSalada =4.5;
        int xBacon=5;
        int torrada= 2;
        double refrigerante=1.5;

        Scanner entrada= new Scanner(System.in);
        System.out.println("escolha seu lanche");
        System.out.printf("digite 1:para cachorro Quente %n" +
                "digite 2:para xSalada %n" +
                "digite 3:para xBacon %n" +
                "digite 4:para torrada %n"+
                "digite 5:para refrigerante %n");
        num= entrada.nextInt();;
        System.out.println("diga a quantidade");
        quant= entrada.nextDouble();
        switch ( num){
            case 1:
                System.out.printf("total: RS %d",cachorroQuente*quant);break;
            case 2:double conta= xSalada*quant;
                System.out.println("total: RS"+conta);break;
            case 3:
                System.out.printf("total: RS %d",xBacon*quant);break;
            case 4:
                System.out.printf("total: RS %d",torrada*quant);break;
            case 5:conta= refrigerante*quant;
                System.out.println("total: RS "+conta);break;
        }




    }


}


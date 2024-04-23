import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int alcool=0; int disel=0; int gasolina=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("qual seu combustivel favorito?");
        System.out.println(" 1.Álcool \n" +
                " 2.Gasolina \n" +
                " 3.Diesel \n" +
                " 4.Fim ");
        int combustivel= entrada.nextInt();
        while(combustivel!=4){
            switch (combustivel){
                case 1: alcool++;break;
                case 2: gasolina++;break;
                case 3: disel++;break;
                default:
                    System.out.println(" código inválido, informe um dos codigos acima");
            }
            combustivel= entrada.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        int total =alcool+disel+gasolina;
        System.out.println("o total de votantes foi "+ total);
        System.out.println("alcool:"+alcool);
        System.out.println("gasolina:"+gasolina);
        System.out.println("disel:"+disel);
        entrada.close();
    }
}
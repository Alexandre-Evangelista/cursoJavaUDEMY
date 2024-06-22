import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Quarto[] quartos = new Quarto[10];

        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();
        entrada.nextLine();

        for (int i=0;i<numero;i++){
            System.out.println("informe nome e email e registre o aluguel");
            String nome= entrada.nextLine();
            String email=entrada.nextLine();
            double aluguel = entrada.nextDouble();
            int numQuarto=entrada.nextInt();
            entrada.nextLine();
            quartos[numQuarto-1 ]= new Quarto(nome,email,aluguel);

        }

        for (int i=0;i< quartos.length;i++){
            if (quartos[i]!=null) {
                System.out.printf("o quarto n %d %n", i + 1);
                System.out.println(quartos[i].getNome());
                System.out.println(quartos[i].getEmail());
                System.out.println(quartos[i].getAluguel());
            }

        }

        entrada.close();
    }
}
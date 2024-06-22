import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();
        entrada.nextLine();
        int maisVelho=0;
        int pos=0;

        String [] vetorPessoa= new String[numero];
        int [] idade = new int[numero];

        for (int i=0;i<vetorPessoa.length;i++){
            System.out.println("informe o nome da pessoa n "+ i);
            vetorPessoa[i]=entrada.nextLine();
            System.out.println("informe a idade");
            idade[i]=entrada.nextInt();
            entrada.nextLine();
            if (i==0){
                maisVelho=idade[i];
            }else if (maisVelho<idade[i]) {
                maisVelho=idade[i];
                pos=i;
            }

        }
        System.out.println("pessoa mais velha: "+vetorPessoa[pos]);

        entrada.close();
    }
}
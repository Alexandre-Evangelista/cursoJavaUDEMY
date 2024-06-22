import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe o total de produtos");
        double soma=0;
        int numero= entrada.nextInt();
        Produto[]produto= new Produto[numero];
        for (int k=0;k<produto.length;k++){
            entrada.nextLine();
            System.out.printf("informe o nome do produto %d%n",k+1);
            String nome= entrada.nextLine();
            System.out.println("informe o preco do produto");
            double preco= entrada.nextDouble();
            produto[k]= new Produto(nome,preco);
            soma+=produto[k].getPreco();

        }
        System.out.println("media");
        System.out.println(soma/numero);
        entrada.close();
    }
}
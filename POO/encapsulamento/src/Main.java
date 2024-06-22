import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();
        double preco = entrada.nextDouble();
        int quant=entrada.nextInt();
        Produto produto = new Produto(nome,preco,quant);
        System.out.println(produto.toString());
        System.out.println("quantos vc deseja adicionar");
        System.out.println(produto.valorTotalEmEstoque());
        int a = entrada.nextInt();
        produto.adicionar(a);
        System.out.println(produto.valorTotalEmEstoque());
        System.out.println("quantos vc deseja remover");
        int r = entrada.nextInt();
        produto.remover(r);
        System.out.println(produto.valorTotalEmEstoque());
        entrada.close();


    }
}
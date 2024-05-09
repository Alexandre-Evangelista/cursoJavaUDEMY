import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto produto = new Produto();
        produto.nome = entrada.nextLine();
        produto.preco = entrada.nextDouble();
        produto.quant = entrada.nextInt();
        System.out.println(produto.nome+"\n"+produto.preco+"\n"+produto.quant);
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

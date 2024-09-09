import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //String data = "25/12/2000";
        //Produto produto = new ProdutosUsados(20,"colar", LocalDate.parse(data,dtf));
        //System.out.println(produto.precoTag());

        Scanner sc = new Scanner(System.in);
        List<Produto> lista = new ArrayList<Produto>();
        System.out.println("diga o total de produtos que deseja");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("caso seja um produto importado digite y");
            char importado = sc.next().charAt(0);
            if (importado == 'y') {
                System.out.println("digite o preco do produto");
                double preco = sc.nextDouble();
                sc.nextLine();
                System.out.println("digite o nome do produto");
                String nome = sc.nextLine();
                System.out.println("digite a taxa do produto ");
                double taxa = sc.nextDouble();
                sc.nextLine();
                lista.add(new ProdutoImportado(preco, nome, taxa));
            }
            else {
                System.out.println("digite o preco do produto");
                double preco = sc.nextDouble();
                sc.nextLine();
                System.out.println("digite o nome do produto");
                String nome = sc.nextLine();
                System.out.println("digite a data de fabricaçao do produto ");
                String data = sc.nextLine();
                lista.add(new ProdutosUsados(preco, nome,LocalDate.parse(data,dtf)));
            }
        }
        for (Produto produto : lista) {
            System.out.println(produto.precoTag());
        }

    }
}
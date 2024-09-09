import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite quantos funcionarios deseja criar");
        int n = sc.nextInt();
        sc.nextLine();
        List<Funcionario>lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("caso dejese criar um funcionario normal digite 0\n" +
                    "caso dejese criar um funcionario tercerizado digite 1");
         int tipoFuncionaro = sc.nextInt();
         sc.nextLine();
         if (tipoFuncionaro == 0) {
             System.out.println("diga o nome do funcionario");
             String nome = sc.nextLine();
             System.out.println("diga o valor hora do funcionario");
             double valorHora = sc.nextDouble();
             System.out.println("diga a quantidade de horas do funcionario");
             int quantidadeHoras = sc.nextInt();
             sc.nextLine();
             lista.add(new Funcionario(nome,quantidadeHoras,valorHora));
         }else{
             System.out.println("diga o nome do funcionario");
             String nome = sc.nextLine();
             System.out.println("diga o valor hora do funcionario");
             double valorHora = sc.nextDouble();
             System.out.println("diga a quantidade de horas do funcionario");
             int quantidadeHoras = sc.nextInt();
             sc.nextLine();
             lista.add(new Tercerizados(nome,quantidadeHoras,valorHora));

         }
        }

        for (Funcionario f : lista) {
            System.out.println(f.toString());
            System.out.println(f.pagamento());
        }

        sc.close();
    }
}
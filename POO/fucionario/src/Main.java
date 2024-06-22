import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fucionario fucionario = new Fucionario();
        System.out.println("informe o nome ,salario bruto e imposto");
        fucionario.nome = entrada.nextLine();
        fucionario.salarioBruto = entrada.nextDouble();
        fucionario.imposto = entrada.nextDouble();
        System.out.printf("%s %.2f %n",fucionario.nome,fucionario.salarioLiquido());
        double porcentagem = entrada.nextDouble();
        fucionario.aumentarSalario(porcentagem);
        System.out.printf("%s %.2f %n",fucionario.nome,fucionario.salarioLiquido());
        entrada.close();
    }
}
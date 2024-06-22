import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("informe o nome e as 3 notas");
        aluno.nome=entrada.nextLine();
        aluno.nota1=entrada.nextDouble();
        aluno.nota2=entrada.nextDouble();
        aluno.nota3=entrada.nextDouble();
        System.out.println(aluno.media());
        aluno.resultado();
        entrada.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();
        entrada.nextLine();


        Aluno [] alunos= new Aluno[numero];

        for (int i=0;i<alunos.length;i++){
            System.out.println("informe o nome e as notas");
            String a= entrada.nextLine();
            double b = entrada.nextDouble();
            double c = entrada.nextDouble();
            entrada.nextLine();

            alunos[i]=new Aluno(a,b,c);

        }


        for (int i=0;i<alunos.length;i++){
            if (alunos[i].media(alunos[i].getNota1(),alunos[i].getNota2())>=6){
                System.out.println(alunos[i].getNome());
            }
        }


        entrada.close();
    }
}
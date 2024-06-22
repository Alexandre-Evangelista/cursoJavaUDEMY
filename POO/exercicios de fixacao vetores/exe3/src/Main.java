import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();

        double cont=0;
        double soma=0;
        Pessoa [] pessoa= new Pessoa[numero];
        for (int i=0;i<pessoa.length;i++){
            entrada.nextLine();
            System.out.printf("dados da pessoa numero %d%n",i+1);
            String nome=entrada.nextLine();
            int idade=entrada.nextInt();
            double altura= entrada.nextDouble();
            pessoa[i]= new Pessoa(nome,idade,altura);
            soma+=pessoa[i].getAltura();
            if (pessoa[i].getIdade()<16){
                cont++;
            }

        }
        double porcetagem=cont/(double)numero*100;
        System.out.println(soma/numero);
        System.out.println(porcetagem+"%");

        for (int i=0;i<pessoa.length;i++){
            if (pessoa[i].getIdade()<16){
                System.out.println(pessoa[i].getNome());
            }
        }
        entrada.close();
    }
}
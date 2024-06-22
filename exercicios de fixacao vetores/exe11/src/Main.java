import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe o total de numeros que deseja digitar");
        int numero= entrada.nextInt();
        entrada.nextLine();
        double menor=0;
        double maior=0;
        int cont=0;



        Pessoa [] pessoas= new Pessoa[numero];

        for (int i=0;i<pessoas.length;i++){
            System.out.println("informe o sexo e a altura");
            String a= entrada.nextLine();
            double b = entrada.nextDouble();
            entrada.nextLine();

            pessoas[i]=new Pessoa(a,b);

            if (pessoas[i].getSexo().equals("m")){
                cont++;
            }

            if (i==0){
                maior=pessoas[i].getAltura();
                menor=pessoas[i].getAltura();

            }else {
                if (maior<pessoas[i].getAltura()){
                    maior=pessoas[i].getAltura();
                }if (menor>pessoas[i].getAltura()){
                    menor=pessoas[i].getAltura();
                }
            }

        }
        // Pessoa p = new Pessoa(" ", 0); gambiarra pesada do chat gpt
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(cont);


        /*System.out.println(p.numHomens(pessoas));
        System.out.println(pessoas.numHomens(pessoas[]));*/


        entrada.close();
    }
}
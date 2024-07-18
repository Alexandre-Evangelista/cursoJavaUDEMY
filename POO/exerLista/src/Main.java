import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();
        lista.add(new Funcionario(333, "Maria Brown", 4000));
        lista.add(new Funcionario(536, "Alex Grey", 3000));
        lista.add(new Funcionario(772, "Bob Green", 5000));

        System.out.println("Lista de funcionários antes do aumento:");
        for (Funcionario x : lista) {
            System.out.println(x.toString());
        }
        System.out.println("digite o id do fucionario que ira receber o aumneto");
        int idFucionario= entrada.nextInt();

        /*metodo para fazer o mesmo que a funçao mas com uma linha
        Funcionario f = lista.stream().filter(x->x.getId()==idFucionario).findFirst().orElse(null);
        apenas mudar pos por f e lista.get(pos) por f*/


        Integer pos= possuiId(lista,idSalario);
        if (pos==null){
            System.out.println("esse id nao existe");
        }else{
            System.out.println("digite quanto esse fucionario receberar de aumento");
            double porcento= entrada.nextDouble();
            lista.get(pos).aumentarSalario(porcento);
        }
        System.out.println("Lista de funcionários depois do aumento:");
        for (Funcionario x : lista) {
            System.out.println(x.toString());
        }


        entrada.close();
    }
    public static Integer possuiId(List<Funcionario> list, int id){
        for (int i =0 ;i<list.size();i++){
            if (list.get(i).getId()==id){
                return i;
            }

        }return null;
    }
}
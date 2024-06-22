import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lista= new ArrayList<>();

        lista.add("maria");
        lista.add("joão");
        lista.add("carlos");
        lista.add("alexandre");
        lista.add("bob");
        lista.add("mariana");
        lista.add(2,"ana");

        /*System.out.println("antes");
        for (String x: lista){
            System.out.println(x);
        }

        System.out.println(lista.size());
        //lista.remove("bob");
        //lista.remove(1);
        //lista.removeIf(x -> x.charAt(0)=='m');predicado o nome desse codigo*/

        System.out.println("depois");
        for (String x: lista){
            System.out.println(x);
        }

        System.out.println("index of alexandre :"+lista.indexOf("alexandre"));
        System.out.println("index of julio :"+lista.indexOf("julio"));
        // indexof quando nao acha retorna -1

        List<String> resultado= lista.stream().filter(x->x.charAt(0)=='a').collect(Collectors.toList());

        for (String x: resultado){
            System.out.println(x);
        }
        String nome= lista.stream().filter(x->x.charAt(0)=='z').findFirst().orElse(null);
        System.out.println(nome);


    }
}
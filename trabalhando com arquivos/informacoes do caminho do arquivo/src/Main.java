import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o caminho do arquivo");
        String arquivo = sc.nextLine();
        File path = new File(arquivo);
        System.out.println("nome do arquivo: "+path.getName());
        System.out.println("achar o caminho sem o nome do arquivo "+path.getParent());
        System.out.println("todo o caminho "+path.getPath());


        sc.close();
    }
}
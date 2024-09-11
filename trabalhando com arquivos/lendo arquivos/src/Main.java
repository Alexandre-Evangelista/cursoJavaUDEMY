import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException  {
    File file = new File("D:\\UDEMY\\Java\\trabalhando com arquivos\\lendo arquivos\\texto.txt");
    Scanner sc = null;

    try {
        sc= new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }catch (IOException e){
        System.out.println("Erro na leitura do arquivo"+e.getMessage());
    }
    finally {
        if (sc != null) {
            sc.close();
        }
    }

    }
}
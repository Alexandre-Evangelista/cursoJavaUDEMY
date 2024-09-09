import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("D:\\UDEMY\\Java\\exceçoes\\finally\\in.txt");
        Scanner sc= null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("erro ao carregar arquivo"+e.getMessage());
        }
        finally {
            if(sc != null){
                // precisa fechar para evitar de arquivo ficar aberto
                sc.close();
            }
        }
    }
}
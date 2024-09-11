import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("informe o nome de uma pasta");
        String strPath = sc.nextLine();
        File path= new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("folders");
        for (File file : folders) {
            System.out.println(file);
        }
        File[] files2 = path.listFiles(File::isFile);
        System.out.println("files");
        for (File file : files2) {
            System.out.println(file);
        }
        //criar pasta
    boolean sucesso = new File(strPath+"\\subdir").mkdir();
    sc.close();
    }
}
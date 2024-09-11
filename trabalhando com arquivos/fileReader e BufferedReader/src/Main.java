import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

    String path = "D:\\UDEMY\\Java\\trabalhando com arquivos\\lendo arquivos\\texto.txt";

        FileReader fl= null;
        BufferedReader br = null;
        try {
            fl= new FileReader(path);
            br = new BufferedReader(fl);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("error"+e.getMessage());
        }
        finally {
            try {

                if (br != null) {
                    br.close();
                }
                if (fl != null) {
                    fl.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
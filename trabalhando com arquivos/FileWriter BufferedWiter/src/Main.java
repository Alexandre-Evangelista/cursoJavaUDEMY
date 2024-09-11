import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path="D:\\UDEMY\\Java\\trabalhando com arquivos\\FileWriter BufferedWiter\\texto.txt";
        String[] lines = new String[]{"good morning","good afternoon","good night"};
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for(String line:lines){
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
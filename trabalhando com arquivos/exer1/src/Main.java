import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        String path=("D:\\UDEMY\\Java\\trabalhando com arquivos\\exer1\\exe.csv");
        String path2=("D:\\UDEMY\\Java\\trabalhando com arquivos\\exer1\\summary.csv");

        List<Item>lista= new ArrayList<Item>();

        File entrada = new File(path);
        File saida = new File(path2);
        if ( !saida.exists()) {
                try {
                    saida.createNewFile();
                    System.out.println("arquivo criado com sucesso");
                }catch (IOException e){
                    e.getMessage();
                }
        }else {
            System.out.println("arquivo ja criado");
        }


        try (BufferedReader br= new BufferedReader(new FileReader(path))) {
            String itemCSV = br.readLine();
            while (itemCSV != null) {
                System.out.println(itemCSV);
                String [] linha = itemCSV.split(",");
                String nome = linha[0];
                double preco = Double.parseDouble(linha[2]);
                int quantidade = Integer.parseInt(linha[1]);
                lista.add(new Item(nome,preco,quantidade));
                itemCSV=br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))){
                for (Item item:lista) {
                    bw.write("\n"+item.getNome()+","+item.total());

                }

            }catch (IOException e){
                e.getMessage();
            }



        }
        catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
        System.out.println("-------------------------------------");


    }
}
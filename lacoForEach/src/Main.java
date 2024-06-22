public class Main {
    public static void main(String[] args) {
        String [] vetor= new String[]{"MARIA","bob", "alex"};

        for (int i=0;i< vetor.length;i++){
            System.out.println(vetor[i]);
        }
        System.out.println("com o for each");
        for (String obj: vetor){
            System.out.println(obj);
            // obj e so o apelido, pode ser qualquer nome
        }



    }
}
public class Aluno {
    public String nome;
    public Double nota1;
    public Double nota2;
    public Double nota3;

    public Double media(){
        return (nota1+nota2+nota3);

    }
    public double notaFinal(){
        return 60-media();
    }
    public double resultado(){
        if (media()>60){
            System.out.println("passou");
        }else {
            System.out.println("nao passou");
            System.out.println(notaFinal());
        }
        return 0;
    }

}

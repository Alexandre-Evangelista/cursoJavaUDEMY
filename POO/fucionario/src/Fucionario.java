public class Fucionario {
    public String nome;
    public Double salarioBruto;
    public Double imposto;
     public double salarioLiquido(){
         return salarioBruto-imposto;
     }
     public void aumentarSalario(double taxa){
         salarioBruto*=1+(taxa/100);
     }

}

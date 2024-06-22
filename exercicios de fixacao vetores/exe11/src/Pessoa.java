public class Pessoa {
    private String sexo;
    private double altura;

    public Pessoa(String sexo, double altura) {
        this.sexo = sexo;
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }
    /*codigo certo chatgpt
    public int numHomens(Pessoa[] pessoa) {
        int cont = 0;
        for (Pessoa p : pessoa) {
            if (p.getSexo().equals("m")) {
                cont++;
            }
        }
        return cont;
    }
    meu codigo errado
public int numHomens(Pessoa pessoa[]){
    int cont=0;
    for (int i = 0; i<pessoa.length; i++){
        if (pessoa[i].sexo =="m"){
            cont++;
        }
    }return cont;

    */





}

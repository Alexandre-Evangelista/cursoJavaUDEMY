public class Produto {
    private String nome;
    private double preco;
    private int quant;
public Produto(){

}
    public Produto(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String toString() {
        return "Produto{" +
                "nome=" + nome +
                ", preco=" + preco +
                ", quant=" + quant +
                '}';
    }

    public double valorTotalEmEstoque(){
        return quant*preco;
    }
    public void adicionar(int quant){
        this.quant+=quant;
    }
    public void remover(int quant){this.quant-=quant;}

}

public class Produto {
    public String nome;
    public double preco;
    public int quant;
    public Produto(String nome, double preco,int quant){
        this.nome=nome;
        this.preco=preco;
        this.quant=quant;
    }
    public double valorTotalEmEstoque(){
        return quant*preco;
    }
    public void adicionar(int quant){
        this.quant+=quant;
    }
    public void remover(int quant){
        this.quant-=quant;
    }
    public String toString(){
        return nome+", $ "+preco+","+quant+" unidades, total: $"+ valorTotalEmEstoque();
    }
}


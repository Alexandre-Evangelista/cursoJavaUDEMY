package classe;

public class OrderItem {
    private Integer quantidade;
    private Product product ;

    public OrderItem() {}


    public OrderItem(Integer quantidade, Product product) {
        this.quantidade = quantidade;
        this.product = product;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double calculaValor() {
        return product.getPreco() * quantidade;
    }
}

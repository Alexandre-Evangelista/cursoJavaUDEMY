import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutosUsados extends Produto{
    private LocalDate dataFabricacao;

    public ProdutosUsados(double preco, String nome, LocalDate dataFabricacao) {
        super(preco, nome);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    @Override
    public final String precoTag() {
        return getNome()+"\n"+getPreco()+"\n"+dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}

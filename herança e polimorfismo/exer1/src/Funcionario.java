public class Funcionario {
    private String nome;
    private Integer horas;
    private double valorHoras;

    public Funcionario(String nome, Integer horas, double valorHoras) {
        this.nome = nome;
        this.horas = horas;
        this.valorHoras = valorHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHoras = valorHoras;
    }
    public double pagamento(){
        return valorHoras * horas;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", horas=" + horas +
                ", valorHoras=" + valorHoras +
                '}';
    }
}

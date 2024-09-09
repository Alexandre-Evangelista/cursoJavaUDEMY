public abstract class Pessoa {
    private String nome;
    private double reandaAnual;
    public Pessoa(String nome, double reandaAnual) {
        this.nome = nome;
        this.reandaAnual = reandaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getReandaAnual() {
        return reandaAnual;
    }

    public void setReandaAnual(double reandaAnual) {
        this.reandaAnual = reandaAnual;
    }
    public abstract double calcularImposto();
}

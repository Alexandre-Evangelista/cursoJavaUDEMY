public class Quarto {
    private String nome;
    private String email;
    private double aluguel;
    public Quarto(String nome,String email,double aluguel){
        this.nome=nome;
        this.email=email;
        this.aluguel=aluguel;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }
}

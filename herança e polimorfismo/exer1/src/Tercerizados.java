public class Tercerizados extends Funcionario{
    private double bonus;

    public Tercerizados(String nome, Integer horas, double valorHoras) {
        super(nome, horas, valorHoras);
        this.bonus = 1.1;
    }

    public double getBonus() {
        return bonus;
    }
@Override
    public  final double pagamento(){
        return super.pagamento()*bonus;
}

    @Override
    public String toString() {
        return super.toString() + "\nBonus: " + bonus;

    }
}

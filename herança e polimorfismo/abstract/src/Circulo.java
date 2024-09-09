public class Circulo extends Corpo{

    private final double PI = 3.14;
    private double raio;

    public Circulo(Cor cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI*Math.pow(raio, 2);
    }
}

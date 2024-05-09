public class Retangulo {
    public double altura;
    public double largura;
    public double area(double a,double l){
        return a*l;
    }
    public double perimetro(double a, double l){
        return 2*a+2*l;
    }
    public double diagonal(double a, double l){
        return Math.sqrt(a*a+l*l);
    }
}

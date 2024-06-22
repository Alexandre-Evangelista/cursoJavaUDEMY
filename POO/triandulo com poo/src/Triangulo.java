public class Triangulo {
    public double lado1;
    public double lado2;
    public double lado3;

    public double Perimetro(double a,double b, double c){
        return (a+b+c)/2;
    }
    public double area(double a,double b, double c){
        double p= Perimetro(a,b,c);
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double z;
        Scanner scanner= new Scanner(System.in);
        z= scanner.nextDouble();
        double area= 3.14*Math.pow(z,2);
        System.out.println("a area é "+area);
    }
}
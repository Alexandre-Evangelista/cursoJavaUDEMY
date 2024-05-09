import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int a,b,c,d;
        Scanner scanner= new Scanner(System.in);
        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();
        d= scanner.nextInt();
        int formula= a*b-c*d;
        System.out.println(formula);
    }

}
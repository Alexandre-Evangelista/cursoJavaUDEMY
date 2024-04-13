import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int x;
        String S1,S2,S3;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.nextLine();
        S1= sc.nextLine();
        S2 = sc.nextLine();
        S3= sc.nextLine();
        System.out.println("vc digitou "+x);
        System.out.println("S1 "+S1);
        System.out.println("S2 "+S2);
        System.out.println("S3 "+S3);
        sc.close();
    }
}

package view;

import classe.*;
import classeEnum.OrderStatus;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Order order1= new Order(new Cliente("alex Green","alex@gmail.com","15/03/2000"),OrderStatus.PROCESSING);

        System.out.println("how many itens to this order?");
        int itens = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < itens; i++) {
            System.out.println("product name");
            String productName = sc.nextLine();
            System.out.println("product price");
            double productPrice = sc.nextDouble();
            System.out.println("product quantity");
            int productQuantity = sc.nextInt();
            order1.addItem(new OrderItem(productQuantity,new Product(productName,productPrice)));
            sc.nextLine();
        }
        System.out.println(order1.total(order1.getItems()));


    }
}
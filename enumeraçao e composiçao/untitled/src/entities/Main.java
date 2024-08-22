package entities;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
    Pedido pedido = new Pedido(1080,new Date(),OrderStatus.PENDING_PAYMENT);
    System.out.println(pedido);
    OrderStatus os1 = OrderStatus.PENDING_PAYMENT;
    OrderStatus os2 = OrderStatus.valueOf("SHIPPED");
        System.out.println(os1);
        System.out.println(os2);
    }
}
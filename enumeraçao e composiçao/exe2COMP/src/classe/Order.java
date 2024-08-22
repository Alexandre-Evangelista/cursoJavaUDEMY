package classe;

import classeEnum.OrderStatus;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Order {
    private Cliente cliente;
    private LocalDateTime momento;
    private OrderStatus status;
    private List<OrderItem> items;


    public Order(Cliente cliente, OrderStatus status) {
        this.cliente = cliente;
        this.momento = LocalDateTime.now();
        this.status = status;
        this.items= new LinkedList<>();
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public void addItem(OrderItem item) {
        items.add(item);
    }
    public void removeItem(OrderItem item) {
        items.remove(item);
    }
    public double total(List<OrderItem> items){
        double soma = 0;
        for(OrderItem item:items){
            System.out.println("Order{" +
                    "cliente=" + cliente +
                    ", momento=" + momento +
                    ", status=" + status );
            soma+=item.calculaValor();
        }
    return soma;}



}


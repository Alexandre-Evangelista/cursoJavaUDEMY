package com.udemy.cursoSpring.entities.enuns;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    CANCELED(3),
    FINISHED(4),
    SHIPPED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    public static OrderStatus valueOf(int code){
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.getCode() == code) {
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }
}

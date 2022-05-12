package com.example.course1.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    final int type;

    OrderStatus(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static OrderStatus valueOf(int type){
        for(OrderStatus value : OrderStatus.values()){
            if (value.getType() == type){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus");
    }
}

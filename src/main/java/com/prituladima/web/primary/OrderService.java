package com.prituladima.web.primary;

/**
 * Created by prituladima on 3/9/18.
 */
public class OrderService {

    private Dao dao;

    public OrderService(Dao dao) {
        this.dao = dao;
    }

    public void placeOrder(String orderId) {
        System.out.println("placing order " + orderId);
        dao.saveOrder(orderId);
    }

}
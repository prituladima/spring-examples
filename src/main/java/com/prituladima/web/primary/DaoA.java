package com.prituladima.web.primary;

/**
 * Created by prituladima on 3/9/18.
 */
public class DaoA implements Dao {

    @Override
    public void saveOrder(String orderId) {
        System.out.println("DaoA Order saved " + orderId);
    }
}
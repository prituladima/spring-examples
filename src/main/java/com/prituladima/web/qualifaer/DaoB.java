package com.prituladima.web.qualifaer;

/**
 * Created by prituladima on 3/9/18.
 */
public class DaoB implements Dao {

    @Override
    public void saveOrder(String orderId) {
        System.out.println("DaoB Order saved " + orderId);
    }
}

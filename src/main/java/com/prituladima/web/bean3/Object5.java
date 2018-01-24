package com.prituladima.web.bean3;

public class Object5 extends Object4 {

    public Object5(int x) {
        super(x);
        System.out.println("init Object5 - " + InfoUtil.toString(this) + " - " + super.getThis());
    }

}

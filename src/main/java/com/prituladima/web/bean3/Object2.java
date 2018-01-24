package com.prituladima.web.bean3;

public class Object2 extends Object1 {

    public Object2(int x) {
        super(x);
        System.out.println("init Object2 - " + InfoUtil.toString(this) + " - " + getThis());
    }

}

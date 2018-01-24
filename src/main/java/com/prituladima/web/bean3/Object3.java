package com.prituladima.web.bean3;

public class Object3 extends Object2 {

    public Object3(int x) {
        super(x);
        System.out.println("init Object3 - " + InfoUtil.toString(this) + " - " + getThis());
    }

}

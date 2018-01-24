package com.prituladima.web.bean3;

public class Object1 extends Object{

    public Object1(int x) {
        super();
        System.out.println("init Object1 - " + InfoUtil.toString(this) + " - " + getThis());
    }

    public String getThis(){
        return InfoUtil.toString(this);
    }
}

package com.prituladima.web.interview;

import javax.annotation.PostConstruct;

/**
 * Created by prituladima on 3/9/18.
 */
public class ObjectA {

    private ObjectB objectB;

    public ObjectA(ObjectB objectB) {
        this.objectB = objectB;
    }

    public ObjectB getObjectB() {
        return objectB;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println(this);
    }
}

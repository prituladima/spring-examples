package com.prituladima.web.interview;

/**
 * Created by prituladima on 3/9/18.
 */
public class ObjectB {

    private ObjectC objectC;
    private ObjectD objectD;

    public ObjectB(ObjectC objectC, ObjectD objectD) {
        this.objectC = objectC;
        this.objectD = objectD;
    }

    public ObjectC getObjectC() {
        return objectC;
    }

    public ObjectD getObjectD() {
        return objectD;
    }
}

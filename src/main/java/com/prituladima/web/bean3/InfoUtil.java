package com.prituladima.web.bean3;

public class InfoUtil {

    public static String toString(Object o){
        if(o == null) return "";
        return o.getClass().getSimpleName();
    }

}

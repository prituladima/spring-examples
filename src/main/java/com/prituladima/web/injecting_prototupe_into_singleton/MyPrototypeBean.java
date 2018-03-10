package com.prituladima.web.injecting_prototupe_into_singleton;

import java.time.LocalDateTime;

/**
 * Created by prituladima on 3/9/18.
 */
public class MyPrototypeBean {

    private String dateTimeString = LocalDateTime.now().toString();

    public String getDateTime() {
        return dateTimeString;
    }
}

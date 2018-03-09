package com.prituladima.web.beens;

import com.prituladima.web.arch.IRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
@Qualifier("my")
public class MyRepository implements IRepository{

    public String getAppName() {
        return "Hello Spring App";
    }

    public Date getSystemDateTime() {
        return new Date();
    }


}

package com.sdite.innovate.experiment3;

import org.litepal.crud.DataSupport;

/**
 * Created by Sdite on 2017/10/1.
 */

public class Data extends DataSupport {
    private String userName;
    private String password;

    public String getUserName(){
        return userName;
    }

    public void setUserName(String name){
        userName = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}

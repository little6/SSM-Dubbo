package com.zdy.common.domain.user;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/28.
 */
public class User implements Serializable {
    private String name;
    private String telephone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {

        return "[zdy+"+name+telephone+"]";
    }
}

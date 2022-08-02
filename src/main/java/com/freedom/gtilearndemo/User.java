package com.freedom.gtilearndemo;

import java.io.Serializable;

/**
 * author: freedom
 * date：2022-08-02 15:44
 */

public class User  implements Serializable {
    int age;
    int sex;
    public User(){};
    public User(int age,int sex){
        this.age=age;
        this.sex=sex;
    }
}

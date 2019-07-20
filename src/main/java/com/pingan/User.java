package com.pingan;

/**
 * 这是一个用户类
 */
/*
    这是用来测试注释的
 */
public class User {
    private String username;
    private int age;
    User(String username,int age){
        this.username = username;
        this.age = age;
    }


    /*
    这是用来测试注释的
    */
    //这是用来测试注释的
    /**
     这是用来测试注释的
     */
    @Override
    public String toString() {
        return username+"今年： "+age+"岁了";
    }
}

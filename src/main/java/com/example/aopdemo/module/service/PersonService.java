package com.example.aopdemo.module.service;

/**
 * @Auther: zhouying
 * @Date: 2020/4/5 22:58
 * @Description:
 */
public interface PersonService {

    default void eat() {
        System.out.println("eat");
    }
}

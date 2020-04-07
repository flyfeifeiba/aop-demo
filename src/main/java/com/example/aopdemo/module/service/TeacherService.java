package com.example.aopdemo.module.service;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

/**
 * @Auther: zhouying
 * @Date: 2020/4/5 23:00
 * @Description:
 */
@Service("teacherServie")
public class TeacherService implements PersonService {
    @Override
    public void eat() {
        System.out.println("teacher eat");
    }
}

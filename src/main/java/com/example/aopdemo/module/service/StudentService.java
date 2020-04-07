package com.example.aopdemo.module.service;

import org.springframework.stereotype.Service;

/**
 * @Auther: zhouying
 * @Date: 2020/4/5 22:59
 * @Description:
 */
@Service("studentService")
public class StudentService  implements PersonService {
    @Override
    public void eat() {
        System.out.println("student eat");
    }
}

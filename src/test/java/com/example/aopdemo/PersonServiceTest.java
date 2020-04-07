package com.example.aopdemo;

import com.example.aopdemo.module.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Auther: zhouying
 * @Date: 2020/4/5 23:02
 * @Description:
 */
@SpringBootTest
public class PersonServiceTest {
    @Resource(name = "studentService")
    private PersonService personService;

    @Test
    public void test() {
        personService.eat();
    }
}

package com.mycom.springboot;

import com.mycom.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *SpringBoot单元测试
 *   可以在测试期间很方便的
 *   类似编码一样进行自动注入容器的功能
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot01HelloworldQuickerApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService22");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}

package com.mycom.springboot.bean;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties:告诉SpringBoot将本类中的所有
 * 属性和配置文件中相关的配置进行绑定;
 * prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 * 默认从全局配置文件中获取值
 * 只有这个组件是容器中的组件，
 * 才能使用容器提供的
 * @ConfigurationProperties功能
 */

//@ConfigurationProperties(prefix = "person")

@ConfigurationProperties(prefix = "person")
@Component
@Data
@PropertySource(value ={"classpath:person.properties"})
public class Person {
    /**
     * <bean>
     *     <property name="lastName"
     *     value="字面量"/${key}从环境变量和配置文件中获取值
     *     /#{spel}></property>
     * </bean>
     */
//    @Value("${person.last-name}")
    private String lastName;
//    @Value("#{11*22}")
    private Integer age;
//    @Value("true")
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> list;
    private Dog dog;
}

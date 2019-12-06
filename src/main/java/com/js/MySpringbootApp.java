package com.js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //声明这个类是Springboot引导类
public class MySpringbootApp {

    public static void main(String[] args) {
        //run方法 表示运行SpringBoot的引导类 run参数就是SpringBoot引导类的字节码对象
        //run方法
        SpringApplication.run(MySpringbootApp.class);
    }

}

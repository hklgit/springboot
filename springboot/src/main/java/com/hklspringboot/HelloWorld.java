package com.hklspringboot;

/**
 * Created by Kerven-HAN on 2019/7/23 13:30.
 * Talk is cheap , show me the code
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//标明这是一个springboot的应用
@SpringBootApplication
public class HelloWorld {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class,args);
    }

}

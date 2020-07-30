package com.atguigu.springcloud;

/**
 * @program: cloud2020
 * @Date: 2020/7/29 14:44
 * @Author: wangyue
 * @Description:
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }

}

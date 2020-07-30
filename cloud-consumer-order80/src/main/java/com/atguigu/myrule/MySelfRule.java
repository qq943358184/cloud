package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @program: cloud2020
 * @Date: 2020/7/30 17:34
 * @Author: wangyue
 * @Description:
 */
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}

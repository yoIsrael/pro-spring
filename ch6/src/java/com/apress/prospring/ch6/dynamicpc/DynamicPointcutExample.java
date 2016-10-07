/*
 * Created on Sep 6, 2004
 */
package com.apress.prospring.ch6.dynamicpc;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.apress.prospring.ch6.staticpc.SimpleAdvice;

/**
 * @author robh
 */
public class DynamicPointcutExample {

    public static void main(String[] args) {
        SampleBean target = new SampleBean();

        // create advisor
        Advisor advisor = new DefaultPointcutAdvisor(
                new SimpleDynamicPointcut(), new SimpleAdvice());
        
        // create proxy
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        SampleBean proxy = (SampleBean)pf.getProxy();
        
        proxy.foo(1);
        proxy.foo(10);
        proxy.foo(100);
        
        proxy.bar();
        proxy.bar();
        proxy.bar();
    }
}
package com.developersview.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pranoy.chakraborty
 * @Date 29/07/22
 */
public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employees employees = context.getBean("employee0",Employees.class);
        System.out.println(employees.toString());
    }
}

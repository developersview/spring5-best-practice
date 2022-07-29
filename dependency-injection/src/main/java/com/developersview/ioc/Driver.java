package com.developersview.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author pranoy.chakraborty
 * @Date 29/07/22
 */
public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student0 = context.getBean("student0", Student.class);
        System.out.println("From ApplicationContext student name is : " + student0.getStudentName());

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        Student student1 = (Student) beanFactory.getBean("student1");
        System.out.println("From BeanFactory student name is : " + student1.getStudentName());
    }
}

package com.point.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Point on 2017/6/12.
 */
public class GreetingMain {
    public static void main(String[] args){
        ClassPathResource resource = new ClassPathResource("com/point/spring/beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Action action = (Action) factory.getBean(" greet ");
        action.greet();
    }
}

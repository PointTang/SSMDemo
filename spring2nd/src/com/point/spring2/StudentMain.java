package com.point.spring2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Point on 2017/6/12.
 */
public class StudentMain {
    public static void main(String[] args){
        ClassPathResource resource = new ClassPathResource("com/point/spring2/beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Student student = (Student) factory.getBean("student");
        student.printInfo();
    }
}

package com.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Student student = (Student)beanFactory.getBean("student-bean");
        student.print();

        Teacher teacher = (Teacher)beanFactory.getBean("teacher-bean");
        teacher.print();

        Substitute substitute = (Substitute)beanFactory.getBean("substitute-bean");
        substitute.print();

        Janitor janitor = (Janitor)beanFactory.getBean("Janitor-bean");
        janitor.print();

        Principal principal = (Principal)beanFactory.getBean("principal-bean");
        principal.print();
    }
}

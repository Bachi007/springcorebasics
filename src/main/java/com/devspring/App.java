package com.devspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext bf=new ClassPathXmlApplicationContext("spring.xml");
    	developer dev=(developer)bf.getBean(developer.class);//object
    	dev.coding();
    	System.out.println("first dev name is : "+dev.getDevName());
    	
    	
    }
}

package org.stackroute.SpringDemoapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
    public static void main(String[] args) {
	    /*------------Normal object approach-----------
			Triangle triangle = new Triangle();
		*/
		
		/*------------Bean factory method--------------
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle =(Triangle)factory.getBean("triangle");
     	triangle.draw();
        */
		
		/*------------application context method --------------- */
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
       	Triangle triangle =(Triangle)  	context.getBean("triangle");
		triangle.draw();
		}
}


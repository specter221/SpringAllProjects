package com.stackroute.jdbcdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.stackroute.jdbcdemo.Circle;
import com.stackroute.jdbcdemo.dao.HibernateDaoImpl;
//import com.stackroute.jdbcdemo.dao.JdbcDaoImpl;

public class JdbcDemo {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		//JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		HibernateDaoImpl dao = ctx.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		
		//Circle circle= dao.getCircle(1);
		
		//Circle circle= new JdbcDaoImpl().getCircle(1);
		//System.out.println(circle.getName());
		System.out.println(dao.getCircleCount());
		//System.out.println(dao.getCircleName(1));
		//System.out.println(dao.getCircleforId(1).getName());
		
		
		//dao.InsertCircle(new Circle(5, "fifth circle"));
		//System.out.println(dao.getCircleName(3));
		//System.out.println(dao.getAllCircles().size());
		
		//dao.CreateTriangleTable();
		
		
	}

}

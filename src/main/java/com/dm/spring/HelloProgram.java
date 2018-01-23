package com.dm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dm.spring.hello.Hello;
import com.dm.spring.hello.HelloService;

public class HelloProgram {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		HelloService service= (HelloService) context.getBean("helloService");
		Hello hello=service.getHello();
		hello.sayHello();
		System.out.println("IDEA TEST");
	}
}

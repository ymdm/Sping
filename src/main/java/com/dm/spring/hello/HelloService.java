package com.dm.spring.hello;

public class HelloService {
	private Hello hello;
	
	public HelloService(Hello hello) {
		super();
		this.hello = hello;
	}

	public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}
	
}

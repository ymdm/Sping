package com.dm.spring.hello.impl;

import com.dm.spring.hello.Hello;

public class SpringHello implements Hello{

	@Override
	public void sayHello() {
		System.out.println("Spring say hello!");
	}
	
}

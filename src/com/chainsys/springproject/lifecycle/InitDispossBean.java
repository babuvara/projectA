package com.chainsys.springproject.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.config.BeanPostProcessor; // refer AOP


public class InitDispossBean implements DisposableBean, InitializingBean {
	private String city;
	private long pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

// called after setters
	@Override
	public void afterPropertiesSet() throws Exception {
       System.out.println("afterPropertiesSet is called");
	}

// similar to destroy method
	@Override
	public void destroy() throws Exception {
         System.out.println("destroy is called");
	}

	public InitDispossBean() {
		System.out.println("InitDispossBean object is created");
	}

	public void setUp() {
		System.out.println("Starting.....InitDispossBean");
	}

	public void close() {
		System.out.println("Closing.....InitDispossBean");

	}

	public void print() {
		System.out.println("print called InitDispossBean");
	}
}

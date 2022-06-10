package com.chainsys.springproject.getbeans;

import org.springframework.context.ApplicationContext;//parent
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.chainsys.springproject.beans.Car;

public class TestCar {
	public static void firstTest() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Car.xml");
		Car c = ac.getBean(Car.class);
		c.start();
		c.rotate();

	}
}

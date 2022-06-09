package com.chainsys.projectA.startup;

import com.chainsys.projectA.getbeans.TestClassPathXml;
import com.chainsys.projectA.beans.Calender;
import com.chainsys.projectA.getbeans.TestAnnotationConfig;

public class Main {

	public static void main(String[] args) {
		// TestClassPathXml.testC();
		// TestClassPathXml.testPrototype();
		// TestClassPathXml.testBeanWithConstructor();
		// TestClassPathXml.testFactoryMethod();
		// TestClassPathXml.testCalenderFactory();
		// TestClassPathXml.testLunchFactory();
		TestAnnotationConfig.testA();
		// Calendar c1 = new Calendar(); // cannot access outside constructor
	}

}
// first JVM gets loaded
// Main method gets Executed
// ApplicationContext is loaded
// ApplicationContext reads xml configuration file
// ApplicationContext pre loads one object for each bean in the config file
// lazy-init="true" This informs springContainer not to pre-load object for this bean.
// By default Spring early loads objects in memory. 
// For lazy-init beans object is created only when the getBean() method is called.
//For pre-init beans getBean() returns the reference of the pre-loaded object 
// By default only one object for every bean is created (singleton)
// singleton: Atleast one object for every class  but not more than one object
// Spring for lazy-init beans creates a singleton object on firstcall of getBeans() method
// and then uses  that object for future getBean() method calls
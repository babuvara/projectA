package com.chainsys.projectA.startup;

import com.chainsys.projectA.beans.Employee;
import org.springframework.context.ApplicationContext;  // parent
import org.springframework.context.support.ClassPathXmlApplicationContext;  // child
public class Main {

	public static void main(String[] args) {
		 testA();
		 testB();
	}

	public static void testA() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Babu");
		emp.print();
	}
	public static void testB() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		// Employee emp = ac.getBean(Employee.class);
		Employee emp = (Employee)ac.getBean("emp");
		emp.setId(200);
		emp.setName("Nirmal");
		emp.print();
	}
}

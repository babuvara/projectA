package com.chainsys.projectA.getbeans;

import org.springframework.context.ApplicationContext;//parent
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;//child
import com.chainsys.projectA.appconfig.AppConfig;
import com.chainsys.projectA.beans.Employee;

public class TestAnnotationConfig {
	public static void testA() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = ac.getBean(Employee.class);
        emp.setId(7);
        emp.setName("Babu");
        emp.print();
		Employee secondemp = ac.getBean(Employee.class);

	}
}

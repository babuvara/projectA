package com.chainsys.springproject.getbeans;

import org.springframework.context.ApplicationContext;//parent
import org.springframework.context.support.ClassPathXmlApplicationContext;//child

import com.chainsys.springproject.beans.Actor;
import com.chainsys.springproject.beans.Calender;
import com.chainsys.springproject.beans.Customer;
import com.chainsys.springproject.beans.Employee;
import com.chainsys.springproject.beans.Lunch;
import com.chainsys.springproject.beans.ScoreBoard;

public class TestClassPathXml {
	public static void testA() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Berlin");
		emp.print();
	}

	public static void testB() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//        Employee emp= ac.getBean(Employee.class);
		Employee emp = (Employee) ac.getBean("emp");
		emp.setId(100);
		emp.setName("MaxWell");
		emp.print();
		Customer c = ac.getBean(Customer.class);
		c.setId(17);
		c.setName("Abde_villiers");
		c.print();
	}

	public static void testlazyinit() {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee) ac1.getBean("emp");
		Customer c = ac1.getBean(Customer.class);
		// lazy-init ="true" for customer. An object is created now (firstcall to
		// getBean() method for Customer.class)
		Employee secondEmp = (Employee) ac1.getBean("emp");
		Customer secondCus = ac1.getBean(Customer.class);
		System.out.println(emp.hashCode());
		System.out.println(secondEmp.hashCode());
		System.out.println(c.hashCode());
		System.out.println(secondCus.hashCode());
	}

	public static void testPrototype() {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("beans.xml");
		Actor hero = ac1.getBean(Actor.class);
		Actor heroin = ac1.getBean(Actor.class);
		Actor comedian = ac1.getBean(Actor.class);
		Actor friend = ac1.getBean(Actor.class);
		System.out.println(hero.hashCode());
		System.out.println(heroin.hashCode());
		System.out.println(comedian.hashCode());
		System.out.println(friend.hashCode());
	}

	public static void testBeanWithConstructor() {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("beans.xml");
	}

	public static void testFactoryMethod() {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("beans.xml");
		ScoreBoard sb = ac1.getBean("sb1", ScoreBoard.class);
		sb.targetScore = 183;
		System.out.println(sb.targetScore);
		ScoreBoard sb2 = ac1.getBean("sb2", ScoreBoard.class);
		System.out.println(sb2.targetScore);
	}

	public static void testCalenderFactory() {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("beans.xml");
		Calender today = ac1.getBean(Calender.class);
		today.day = 9;
		today.year = 2022;
		today.month = "june";
		System.out.println(today.day);
		System.out.println(today.year);
		System.out.println(today.month);
	}

	public static void testLunchFactory() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Lunch.xml");
		Lunch nvsilunch = ac.getBean("nvsilunch", Lunch.class);
		Lunch vsilunch = ac.getBean("vsilunch", Lunch.class);
		Lunch nilunch = ac.getBean("nilunch", Lunch.class);
		Lunch chlunch = ac.getBean("chlunch", Lunch.class);
		System.out.println("-----");
		nvsilunch.serve();
		System.out.println("-----");
		vsilunch.serve();
		System.out.println("-----");
		nilunch.serve();
		System.out.println("-----");
		chlunch.serve();
	}
	public static void testSetterDi()
	{
		ApplicationContext ac1=new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=ac1.getBean("emp2",Employee.class);
		emp.print();
	}
}

package com.chainsys.projectA.beans;
//multiple factory methods in one class
// Calendar factory is also called as initiating bean because methods in this bean instantiates objects for other beans
public class CalenderFactory {
	//factory-method is not static here
		public Calender createCalender()
		{
			//The calendar constructor is default access modifier so, can be called here
			//The calendar
			return new Calender();
		}
		public Appointments createAppointment() { 
			return new Appointments();
		}
}

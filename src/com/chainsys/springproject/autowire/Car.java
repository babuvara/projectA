package com.chainsys.springproject.autowire;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource; // Resourse does not work

public class Car {
	@Autowired
	private Engine petrolEngine;
	@Autowired(required = false)  //null point error
	private Wheel alloy;

	public Car() {
		System.out.println("1 Car Object created " + hashCode());
	}

	public Car(Engine petrolEngine, Wheel alloy) {
		System.out.println("2 Car Object created " + hashCode());
		this.petrolEngine = petrolEngine;
		this.alloy = alloy;
	}

	@PostConstruct
	public void begin() {
		System.out.println("Start AnnotationLifeCycle...");
	}

	@PreDestroy
	public void stop() {
		System.out.println("Stoped AnnotationLifeCycle...");
	}

	public void start() {
		petrolEngine.start();
	}

	public void move() {
		alloy.rotate();
	}

	@Component("SuvCar")
	class SportsCar extends Car {
		public SportsCar() {
			System.out.println("SportsCar is started" + hashCode());
		}
	}

	class SuvCar extends Car {
		public SuvCar() {
			System.out.println("Suv is started" + hashCode());
		}
	}
}
package com.chainsys.springproject.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
// not working from java9 and higher version
public class AnnotationLifeCycle {
	public AnnotationLifeCycle() {
		System.out.println("AnnotationLifeCycle object created " + hashCode());
	}
	@PostConstruct
	public void start() {
		System.out.println("Start AnnotationLifeCycle...");
	}
	@PreDestroy
	public void stop() {
		System.out.println("Stoped AnnotationLifeCycle...");
	}
	public void print() {
		System.out.println("print AnnotationLifeCycle called");
	}
}

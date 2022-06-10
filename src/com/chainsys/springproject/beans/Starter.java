package com.chainsys.springproject.beans;

public abstract class Starter {
	public String name;
}

class Chicken extends Starter {
	public Chicken() {
		name = "Honeychicken";
	}
}

class Soup extends Starter {
	public Soup() {
		name = "Sweetcorn";
	}

}

class Vegroll extends Starter {
	public Vegroll() {
		name = "Cabbageroll";
	}
}
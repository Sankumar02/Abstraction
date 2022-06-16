package com.InterfaceAbstractionexamples;

public abstract class Animal {
	public abstract void cats();

	public abstract void dogs();
}

class Cats extends Animal {

	public void cats() {

		System.out.println("Cats meow");
	}

	public void dogs() {
	}

}

class Dogs extends Animal {

	public void dogs() {
		System.out.println("Dogs bark");
	}

	public void cats() {
	}

}

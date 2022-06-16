package com.Task_20_04_22;

public abstract class Athelete {

	// non - abstract methods
	public void eat() {
		System.out.println("I eat Healthy foods");
	}

	public void sleep() {
		System.out.println("I Sleep 8hours a day");
	}

	// abstract methods
	public abstract void event();

	public abstract void accomplishment();

}

class NeerajChopra extends Athelete {

	@Override
	public void event() {
		System.out.println("Event Javelin");

	}

	@Override
	public void accomplishment() {
		System.out.println("Accomplishment - Gold in Olympics 2021");

	}

}

class RaviKumar extends Athelete {

	@Override
	public void event() {
		System.out.println("Event - Wrestling");

	}

	@Override
	public void accomplishment() {
		System.out.println("Accomplishment - Silver in Olympics 2021");

	}

}

class PVSindhu extends Athelete {

	@Override
	public void event() {
		System.out.println("Event - Badminton");

	}

	@Override
	public void accomplishment() {
		System.out.println("Accomplishment - Bronze in Olympics 2021");

	}

}
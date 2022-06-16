package com.InterfaceAbstractionexamples;

/*
 * Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 
 * are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 
 * 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of 
 * the three classes.
 */
public abstract class Bank {
	 abstract String getBalance();
}

class BankA extends Bank {

	@Override
	 String getBalance() {
		return "$100";
	}
}

class BankB extends Bank {

	@Override
	 String getBalance() {
		return "$200";
	}
}

class BankC extends Bank {

	@Override
	 String getBalance() {
		return "$300";
	}
}

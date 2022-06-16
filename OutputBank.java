package com.InterfaceAbstractionexamples;

public class OutputBank {

	public static void main(String[] args) {
		BankA oA = new BankA();
		System.out.println("The bank balance of bank A is " + oA.getBalance());
		BankB oB = new BankB();
		System.out.println("The bank balance of bank B is " + oB.getBalance());
		BankC oC = new BankC();
		System.out.println("The bank balance of bank C is " + oC.getBalance());
	}

}

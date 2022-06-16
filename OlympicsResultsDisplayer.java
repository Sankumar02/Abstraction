package com.Task_20_04_22;

public class OlympicsResultsDisplayer {

	public static void main(String[] args) {

		System.out.println("-----NeerajChopra-----");
		Athelete oChopra = new NeerajChopra();
		oChopra.event();
		oChopra.accomplishment();
		oChopra.eat();
		oChopra.sleep();
		System.out.println();

		System.out.println("-----RaviKumar-----");
		Athelete oKumar = new RaviKumar();
		oKumar.event();
		oKumar.accomplishment();
		oKumar.eat();
		oKumar.sleep();
		System.out.println();

		System.out.println("-----PVSindhu-----");
		Athelete oPvSindhu = new PVSindhu();
		oPvSindhu.event();
		oPvSindhu.accomplishment();
		oPvSindhu.eat();
		oPvSindhu.sleep();
		System.out.println();

	}

}

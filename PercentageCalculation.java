package com.InterfaceAbstractionexamples;

public class PercentageCalculation
{

	public static void main(String[] args) 
	{
		StudentA oA=new StudentA(90,80,90);
		oA.getMarks();		
		StudentB oB=new StudentB(90, 70, 80, 95);
		oB.getMarks();

	}

}
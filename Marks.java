package com.InterfaceAbstractionexamples;
/*
 * We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
 * by student A and in four subjects (each out of 100) by student B. Create an abstract class 
 * 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' 
 * each having a method with the same name which returns the percentage of the students. The constructor
 *  of student A takes the marks in three subjects as its parameters and the marks in four subjects as its 
 *  parameters for student B. Create an object for each of the two classes and print the percentage of marks for 
 *  both the students
 */

public abstract class Marks
{
	 abstract void getMarks();
}

class StudentA extends Marks 
{
	int maths ;
	int physics;
	int chemistry;

	  StudentA(int mark1, int mark2, int mark3) 
	  {
		  maths = mark1; 
		  physics = mark2;
	      chemistry = mark3; 
	  }

	@Override
	public void getMarks() 
	{
		System.out.println("=====Marks obtained by Student A======");
		System.out.println();
		System.out.println("Mark-Maths :" + maths);
		System.out.println("Mark-physics :" + physics);
		System.out.println("Mark-chemistry :" + chemistry);
		System.out.println("Percentage obtained by Student B is " + ((maths + physics + chemistry) /(double)300)*100);
		System.out.println();
	}

}

class StudentB extends Marks 
{
	int maths;
	int physics;
	int chemistry;
	int biology;

	StudentB(int mark1, int mark2, int mark3, int mark4) 
	{
		maths = mark1;
		physics = mark2;
		chemistry = mark3;
		biology = mark4;
	}

	@Override
	public void getMarks() 
	{
		System.out.println("=====Marks obtained by Student B======");
		System.out.println();
		System.out.println("Mark-Maths :" + maths);
		System.out.println("Mark-physics :" + physics);
		System.out.println("Mark-chemistry :" + chemistry);
		System.out.println("Mark-biology :" + biology);
		System.out.println("Percentage obtained by Student B is " + ((maths + physics + chemistry + biology) / (double)400)*100);

	}

}

package com.InterfaceAbstractionexamples;
/*
 * We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with 
 * three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking 
 * one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
 * side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 
 * 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
 *  Create an object of class 'Area' and call all the three methods.
 */

public abstract class Shape {
	public abstract int RectangleArea(int length,int breadth);
	public abstract int SquareArea(int side);
	public abstract double CircleArea(double radius);
}

class Area extends Shape{
	
	@Override
	public int RectangleArea(int length, int breadth) {
		
		return length*breadth;
	}

	@Override
	public int SquareArea(int side) {
		
		return side*side;
	}

	@Override
	public double CircleArea(double radius) {
		
		return 3.142*radius*radius;
	}
	
}
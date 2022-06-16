package com.InterfaceAbstractionexamples;

public class AreaCalculate {

	public static void main(String[] args) {
		
		Area oArea=new Area();
		
		System.out.println("Area of Rectngle : "+oArea.RectangleArea(2, 1));

		System.out.println("Area of Square : "+oArea.SquareArea(2));
		
		System.out.println("Area of Circle : "+oArea.CircleArea(3));

	}

}

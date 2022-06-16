package com.InterfaceAbstractionexamples;

abstract class AbstractShape {
	int numSides;

	public AbstractShape(int newSides) {
		numSides = newSides;
	}

	public int getNumSides() {
		return numSides;
	}

	public abstract double getArea();

	public abstract double getPerimeter();
}

class Rectangles2 extends AbstractShape {
	double height, width;

	public Rectangles2(double w, double h) {
		super(4);
		this.height = h;
		this.width = w;
	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}
}

class Triangle extends AbstractShape {
	double height, width;

	public Triangle(double w, double h) {
		super(4);
		this.height = h;
		this.width = w;
	}

	public double getArea() {
		return (height * width) / 2;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}
}

public class RectangleTriangle {
	public static void main(String[] args) {
		Rectangles2 r = new Rectangles2(10, 20);
		System.out.println("Rectangle - Area: " + r.getArea());
		System.out.println("Rectangle - perimeter: " + r.getPerimeter());
		Triangle c = new Triangle(20, 30);
		System.out.println("Triangle - Area: " + c.getArea());
		System.out.println("Triangle - perimeter: " + c.getPerimeter());
	}
}
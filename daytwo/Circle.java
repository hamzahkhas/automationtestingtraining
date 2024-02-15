package daytwo;

import java.util.Scanner;

public class Circle {
	
	private double radius;
	private String color;
	
	public Circle(double radius,String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// calculate area of circle
	public double calculateArea(double radius) {
		double areaOfCircle = radius * radius * Math.PI;
		return areaOfCircle; 
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius of circle: ");
		double radius = sc.nextDouble();	
		
		System.out.print("Enter color of circle: ");
		String color = sc.next();
		String convColor = color.toUpperCase();
		
		Circle circle = new Circle(radius,convColor);
		
		System.out.println("\nRadius of Circle: "+circle.getRadius()+"\nColor of circle: "+circle.getColor()+"\nArea of circle: "+circle.calculateArea(radius));
		
		sc.close();
	}

}

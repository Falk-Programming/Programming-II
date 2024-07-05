package programming;

import java.util.Scanner;

public class Cylinder extends Shape{
static double Radius;
static double height;
	
	
	
	public static void constructor() {

		Radius = 2.3;
		height = 4.8;
		ToString();

	}
	public static void ToString() {
		double surface_area;
		double volume;
		
		surface_area = (2 * Math.PI * Radius * height) + (2 * Math.PI * (Radius * Radius));
		System.out.println("Cylinder Surface Area: " + surface_area);
		volume = Math.PI * (Radius * Radius) * height;
		System.out.println("Cylinder Volume: " + volume);
	
	
	}
}

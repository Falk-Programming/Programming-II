package programming;

import java.util.Scanner;

public class Sphere extends Shape{
	static double Radius;
	
	
	
	public static void constructor() {
		Radius = 4.3;
		ToString();

	}
	public static void ToString() {
		double surface_area;
		double volume;
		
		surface_area = 4 * Math.PI * (Radius * Radius);
		System.out.println("Sphere Surface Area: " + surface_area);
		volume = 4/3 * Math.PI * (Radius * Radius * Radius);
		System.out.println("Sphere Volume: " + volume);
		
	}
}

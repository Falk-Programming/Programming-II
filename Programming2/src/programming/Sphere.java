package programming;

import java.util.Scanner;

public class Sphere extends Shape{
	static double Radius;
	static double surface_area;
	static double volume;
	
	public void constructor() {
		Radius = 4.3;
		ToString();

	}
	public void ToString() {
		surface_area();
		volume();
		System.out.println("Sphere Surface Area: " + surface_area);
		System.out.println("Sphere Volume: " + volume);
		
	}
	@Override
	public double surface_area() {
		surface_area = 4 * Math.PI * (Radius * Radius);
		return surface_area;
	}
	@Override
	public double volume() {
		volume = 4/3 * Math.PI * (Radius * Radius * Radius);
		return volume;
	}
}

package programming;

import java.util.Scanner;

public class Cylinder extends Shape{
static double Radius;
static double height;
static double surface_area;
static double volume;
	
	
	public void constructor() {

		Radius = 2.3;
		height = 4.8;

		ToString();

	}
	public void ToString() {
		surface_area();
		volume();
		System.out.println("Cylinder Surface Area: " + surface_area);
		System.out.println("Cylinder Volume: " + volume);
	
	
	}
	@Override
	public double surface_area() {
		surface_area = (2 * Math.PI * Radius * height) + (2 * Math.PI * (Radius * Radius));
		return surface_area;
	}
	@Override
	public double volume() {
		volume = Math.PI * (Radius * Radius) * height;
		return volume;
	}
}

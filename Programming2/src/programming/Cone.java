package programming;

import java.util.Scanner;

public class Cone extends Shape{
	static double Radius;
	static double height;
	static double surface_area;
	static double volume;
		
		
		public void constructor() {
			Radius = 3.6;
			height = 1.8;
			ToString();

		}
		public void ToString() {
			surface_area();
			volume();
			System.out.println("Cone Surface Area: " + surface_area);	
			System.out.println("Cone Volume: " + volume);
		
		
		}
		@Override
		public double surface_area() {
			surface_area = Math.PI * Radius * (Radius + Math.sqrt((height * height) + (Radius * Radius)));
			return surface_area;
		}
		@Override
		public double volume() {
			volume = Math.PI * (Radius * Radius) * height/3;
			return volume;
		}
}

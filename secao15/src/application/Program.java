package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities_enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.println("Enter the number of shapes");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + i + "data:");
			System.out.println("Rectangle or Circle (r/c) ? ");
			char c = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): " );
			Color color = Color.valueOf(sc.next());

			if (c == 'r') {
				System.out.println("Width: ");
				Double width = sc.nextDouble();
				System.out.println("Height");
				Double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));

			} else if (c == 'c') {
				System.out.println("Radius: ");
				Double radius = sc.nextDouble();
				
				list.add(new Circle(color, i));
			}

			System.out.println("");
			System.out.println("SHAPE AREAS:");
			for(Shape shape: list) {
				System.out.println(String.format("%.2f", shape.area()));
			}

		}

	}

}

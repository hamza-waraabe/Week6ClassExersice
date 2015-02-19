import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		System.out.println("input width and height of rectangle");
		double width , height ,perimeter , area ;
		Scanner keyboard = new Scanner(System.in);
		width = keyboard.nextDouble();
		height = keyboard.nextDouble();
		perimeter = 2*(width+height);
		area = width*height;
		
		System.out.println("The perimeter is " +perimeter + "\n" + "The area is "  +area);

}

}
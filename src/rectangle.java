/**
 * 
 * @author Philip Wellener
 * Period 7
 * Comp Sci
 *
 */
import java.util.Scanner;


public class rectangle 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What is the length of the rectangle: ");
		double length = in.nextDouble();
		in.nextLine();
		System.out.print("\nWhat is the width of the rectangle: ");
		double width = in.nextDouble();
		in.nextLine();
		
		double area = length*width;
		double perimeter = 2*length + 2*width;
		double diagonal = Math.sqrt(Math.pow(length, 2)+Math.pow(width, 2));
		
		
		

	}

}

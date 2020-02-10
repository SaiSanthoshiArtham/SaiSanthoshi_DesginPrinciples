package designprinciples;
import java.util.Scanner;
//Layered Architecture
public class console {

	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	MathOperations math = new MathOperations();
	      System.out.print("Enter two numbers a, b for calculation: ");
	      double a = sc.nextDouble();
	      double b = sc.nextDouble();
	      System.out.print("Enter an operator (+, -, *, /): ");
	      char operator = sc.next().charAt(0);
	      math.Calculator(a,b,operator);
	 
	}
}
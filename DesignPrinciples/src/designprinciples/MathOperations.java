package designprinciples;
//Calculator Program


public class MathOperations {
	public static void Calculator(double a , double b, char operator){
	double result = 0;
	switch(operator){
	          case '+':
	              result = a + b;
	              break;
	          case '-':
	              result = a - b;
	              break;
	          case '*':
	              result = a * b;
	              break;
	          case '/':
	              result = a / b;
	              break;
	          default:
	              System.out.printf("operator is not correct");
	              break;
	      }
	System.out.println(result);
	}
}

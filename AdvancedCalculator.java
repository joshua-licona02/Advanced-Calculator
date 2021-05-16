import java.util.Scanner;

//HR: SimpleCalculator Code

public class AdvancedCalculator  {
public static void main(String[]args) {
		
		double num1=0;
		double num2=0;
		double answer=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter numbers one at a time. If looking for square root, ceil, or fibonacci, enter -0 as number");
		num1=input.nextDouble();
		num2=input.nextDouble();
		
	if(num2!=-0) {
		System.out.println("Enter +, -, /, or *");
			char operator=input.next().charAt(0);
			
			if(operator=='+') {
				answer=add(num1, num2);
			}
			else if(operator=='-') {
				answer=subtract(num1, num2);
			}
			else if(operator=='/') {
				answer=divide(num1, num2);
			}
			else if(operator=='*') {
				answer=multiply(num1, num2);
			}
			
			System.out.println(num1+" "+operator+" "+num2+" = "+answer);
			
	}
	
	else {
		System.out.println("Enter 'S' for square root, 'C' for ceil, or 'L' for log");
			char operator=input.next().charAt(0);
			
			if(operator=='S') {
				answer=Math.sqrt(num1);
				System.out.println("The sqrt of "+num1+" is "+answer);
			}
			else if(operator=='C') {
				answer=Math.ceil(num1);
				System.out.println("The ceil of "+num1+" is "+answer);
			}
			else if(operator=='L') {
				answer=Math.log(num1);
				System.out.println("The log of "+num1+" is "+answer);
			}
			
			
	}
		
	}
public static int add(double num1, double num2) {
	return (int) (num1+num2);
}
public static int subtract(double num1, double num2) {
	return (int)(num1-num2);
}
public static int divide(double num1, double num2) {
	return (int)(num1/num2);
}
public static int multiply(double num1, double num2) {
	return (int)(num1*num2);
}
}

import java.util.Scanner;
class CalculatorProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Num1:");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter Num2:");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter Operator:");
		char op = sc.next().charAt(0);
		
		double opt = 0;
		
		opt = (op=='+')?(num1 + num2):
			  ((op=='-')?(num1 - num2):
			  ((op=='*')?(num1 * num2):
			  ((op=='/')?(num1 / num2):
			  ((op=='%')?(num1 % num2):(0)))));
		
		String output = num1+" "+op+" "+num2+" = "+opt;
		
		if (!(opt==0))
		{
			System.out.println(output);
		}
		
	}
}
